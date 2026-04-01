package gr.codehub.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertAll;


public class s02GenericTest {


    @Test
    void shouldCompareEqualInputAndOutput() {
        int input = 8;
        int output = Math.random() >= 0.5 ? 4 : 8;
        System.out.println("Test starting");
        assertEquals(input, output);
        assertEquals(4, input);
    }


    @Test
    void shouldRunWithoutDependencies() {
        System.out.println("This is test 1");
        assertEquals(1, 1);
    }

    @Test
    void shouldAlwaysFail() {
        System.out.println("This will always run");
        fail("This test should never be run for System ABC");
        System.out.println("This will never run");
    }

    @Test
    void shouldReturnThreeTimesTheInput() {
        assertEquals(12, Main.getANumber(5), "The input value should be multiplied by 3");
    }

    @Test
    void shouldPassIfArraysEqual() {
        boolean[] input = {true, true, false};
        boolean[] output = {false, false, true};
        assertArrayEquals(input, output, "Output should match input");
    }

    @Test
    void shouldPassIfDoubleArraysEqual() {
        double[] input = {0.1, 0.2, 0.3};
        double[] output = {0.05 + 0.05, 0.1 + 0.1, 0.1 + 0.2};
        assertArrayEquals(input, output, 0.00001, "Output should match input");
    }

    @Test
    void shouldValidateMatchingInputAndOutput() {
        int input = 8;
        int output = 4;
        assertTrue(input == output, "Input and output must be the same");
    }

    @Test
    void shouldAssertAllOperationsCorrect() {
        assertAll("Tests for Greece",
                () -> {
                    System.out.println();
                    System.out.println();
                    assertEquals("Sea", "See");
                } ,
                () -> assertFalse(3 == 3),
                () -> assertEquals( 2 , 2)
        );


    }

}
