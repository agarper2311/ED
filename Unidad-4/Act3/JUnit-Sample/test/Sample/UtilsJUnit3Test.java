/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sample.Utils;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Utils class.
 */
public class UtilsJUnit5Test {

    public UtilsJUnit5Test() {
    }

    @BeforeAll
    public static void setUpClass() {
        // This method can be used to set up class-wide test fixtures.
        System.out.println("Setting up class-wide resources...");
    }

    @AfterAll
    public static void tearDownClass() {
        // This method can be used to clean up class-wide test fixtures.
        System.out.println("Cleaning up class-wide resources...");
    }

    @BeforeEach
    public void setUp() {
        // This method can be used to set up each test case.
        System.out.println("Setting up before a test...");
    }

    @AfterEach
    public void tearDown() {
        // This method can be used to clean up after each test case.
        System.out.println("Cleaning up after a test...");
    }

    @Test
    public <String> void testConcatWords() {
        System.out.println("Testing concatWords");
        String[] words = {"Hello", "world"};
        String expected = "Helloworld";
        String result = Utils.concatWords(words);
        assertEquals(expected, result, "The concatenated words do not match the expected output.");
    }

    @Test
    public void testComputeFactorial() {
        System.out.println("Testing computeFactorial");
        int number = 5;
        int expected = 120; // Assuming the method is supposed to return an int
        int result = Utils.computeFactorial(number); // This line assumes computeFactorial returns an int
        assertEquals(expected, result, "The factorial does not match the expected output.");
    }

    @Test
    public void testNormalizeWord() {
        System.out.println("Testing normalizeWord");
        String word = "TeSt";
        String expected = "test"; // Assuming the goal is to lowercase the word
        String result = Utils.normalizeWord(word);
        assertEquals(expected, result, "The normalized word does not match the expected output.");
    }
}
