package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SettingsFileEngineTestSuite {
    @BeforeClass
    public static void openSettingsFile(){
        SettingsFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile(){
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //G
        //W
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: " + fileName);
        //T
        assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //G
        //W
        boolean result = SettingsFileEngine.getInstance().loadSettings();
        //T
        assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //G
        //W
        boolean result = SettingsFileEngine.getInstance().saveSettings();
        //T
        assertTrue(result);
    }
}