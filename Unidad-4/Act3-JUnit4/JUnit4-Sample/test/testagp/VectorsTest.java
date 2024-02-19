/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testagp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sample.Vectors;

public class VectorsTest {

    public VectorsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        // Test with two null arrays (assuming the implementation throws IllegalArgumentException for null arguments)
        try {
            boolean result = Vectors.equal(null, null);
            fail("IllegalArgumentException expected for null inputs");
        } catch (IllegalArgumentException e) {
            // Expected behavior, test passes
        }

        // Test with two equal arrays
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        boolean expResult = true;
        boolean result = Vectors.equal(a, b);
        assertEquals(expResult, result);

        // Test with two different arrays
        int[] c = {1, 2, 3};
        int[] d = {4, 5, 6};
        expResult = false;
        result = Vectors.equal(c, d);
        assertEquals(expResult, result);
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    @Test
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        // Test with two vectors
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int expResult = 1*4 + 2*5 + 3*6; // Expected result of scalar multiplication
        int result = Vectors.scalarMultiplication(a, b);
        assertEquals(expResult, result);

        // Test with two vectors of different sizes (assuming the implementation throws IllegalArgumentException for vectors of different sizes)
        int[] c = {1, 2, 3};
        int[] d = {4, 5};
        try {
            result = Vectors.scalarMultiplication(c, d);
            fail("IllegalArgumentException expected for vectors of different sizes");
        } catch (IllegalArgumentException e) {
            // Expected behavior, test passes
        }
    }

}
