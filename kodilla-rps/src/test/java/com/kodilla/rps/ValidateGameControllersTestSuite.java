package com.kodilla.rps;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ValidateGameControllersTestSuite {
    private ValidateGameControllers validateGameControllers;
    private Scanner scanner;
    private Display display;

    /**
     * testing game.
     */
    @Before
    public void setUp() {
        validateGameControllers = new ValidateGameControllers();
        scanner = new Scanner("Y");
        display = new Display();
    }

    @Test
    public void testValidateEmptyString() {
        assertEquals(0, validateGameControllers.validateNumber(""));
    }

    @Test
    public void testValidateStringWithOtherChars() {
        assertEquals(0, validateGameControllers.validateNumber("q23s"));
    }

    @Test
    public void testValidateStringWithCorrectNumber() {
        assertEquals(22, validateGameControllers.validateNumber("22"));
    }

    @Test
    public void testValidateGameStoneInput() {
        assertEquals("ROCK", validateGameControllers.validateGameInput("1", scanner, display));
    }

    @Test
    public void testValidateGamePaperInput() {
        assertEquals("PAPER", validateGameControllers.validateGameInput("2", scanner, display));
    }

    @Test
    public void testValidateGameScissorsInput() {
        assertEquals("SCISSORS", validateGameControllers.validateGameInput("3", scanner, display));
    }

    @Test
    public void testValidateGamExitInput() {
        assertEquals("x", validateGameControllers.validateGameInput("x", scanner, display));
    }

    @Test
    public void testValidateGameNewInput() {
        assertEquals("n", validateGameControllers.validateGameInput("n", scanner, display));
    }

    @Test
    public void testValidateEndOfGameNewGameChoice() {
        assertEquals("n", validateGameControllers.validateEndOfGameChoice("n", scanner, display));
    }

    @Test
    public void testValidateEndOfGameQuitChoice() {
        assertEquals("x", validateGameControllers.validateEndOfGameChoice("x", scanner, display));
    }
}