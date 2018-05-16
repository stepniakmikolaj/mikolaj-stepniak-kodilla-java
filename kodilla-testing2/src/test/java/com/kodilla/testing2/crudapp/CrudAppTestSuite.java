package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://stepniakmikolaj.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCreateCruddAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task Number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(10000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(5000);
    }

    private boolean chceckTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.xpath("//*[@id=\"google-link\"]")).click();

        Thread.sleep(2000);

        driverTrello.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("xxxxxxxxxxxxxxx@xxxxxxxx.xx");

        driverTrello.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();

        Thread.sleep(2000);

        driverTrello.findElement(By.xpath("//input[contains(@class, \"whsOnd\")]")).sendKeys("xxxxxxxxxxxxxxxxx");

        driverTrello.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();

        Thread.sleep(2000);

        driverTrello.findElement(By.xpath("//span[contains(@class, \"header-btn-text\")]")).click();

        Thread.sleep(5000);

        driverTrello.findElements(By.xpath("//a[contains(@class, \"compact-board-tile-link\")]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Applicatoin\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(10000);

        result = driverTrello.findElements(By.xpath(".//span[contains(@class, \"list-card-title\")]")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        Thread.sleep(10000);

        driverTrello.close();

        return result;
    }

    public void deleteCrudCard(String taskName) throws InterruptedException {
        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(form ->
                        form.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(form ->
                        form.findElements(By.xpath(".//button")).stream()
                                .filter(button -> button.getText().equals("Delete"))
                                .forEach(WebElement::click));

        Thread.sleep(1000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCreateCruddAppTestTask();
        sendTestTaskToTrello(taskName);
        deleteCrudCard(taskName);
        assertTrue(chceckTaskExistsInTrello(taskName));
    }
}