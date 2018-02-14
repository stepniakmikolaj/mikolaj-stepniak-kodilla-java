package com.kodilla.patterns.singleton;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTestSuite {
    @BeforeClass
    public static void log() {
        Logger.getInstance().log("abc");
    }

    @Test
    public void testGetLastLog() {
        //G
        //W
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println(lastLog);
        //T
        assertEquals("abc", lastLog);
    }
}