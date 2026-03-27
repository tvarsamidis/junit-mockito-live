package gr.codehub.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


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

}
