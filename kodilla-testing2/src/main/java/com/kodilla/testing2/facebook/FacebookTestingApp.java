package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://facebook.com");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoardDay = new Select(selectDay);
        selectBoardDay.selectByIndex(11);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoardMonth = new Select(selectMonth);
        selectBoardMonth.selectByIndex(11);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoardYear = new Select(selectYear);
        selectBoardYear.selectByValue("1918");
    }
}
