/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testagp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sample.Utils;

public class UtilsTest {

    public UtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConcatWords() {
        System.out.println("concatWords");
        String[] words = {"Hello", "world"};
        String expResult = "Helloworld";
        String result = Utils.concatWords(words);
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        int number = 5;
        long expResult = 120; // 5! = 120
        long result = Long.parseLong(Utils.computeFactorial(number));
        assertEquals(expResult, result);
    }

    @Test
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "Test";
        String expResult = "test"; // Assuming normalization means converting to lowercase
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
    }

}
