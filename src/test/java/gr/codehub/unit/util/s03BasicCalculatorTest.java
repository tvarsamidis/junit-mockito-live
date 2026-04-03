package gr.codehub.unit.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class s03BasicCalculatorTest {

    private static BasicCalculator basicCalculator = null;

    @BeforeAll
    static void runBeforeAllTests() {
        System.out.println("*** CLASS INITIALIZATION TEST");
        basicCalculator = new BasicCalculator();
    }

    @AfterAll
    static void runAfterAllTests() {
        System.out.println("Log entry: tests completed");
    }

    @BeforeEach
    void setupBeforeEachTest() {
        System.out.println("*** RUN BEFORE EACH TEST");
        assertNotNull(basicCalculator, "basicCalculator must exist at initialization");
        basicCalculator.setResult(0);
    }

    @AfterEach
    void confirmAfterEachTest() {
        System.out.println("*** CONFIRM AFTER EACH TEST");
        assertNotNull(basicCalculator, "basicCalculator must exist at exit");
    }

    @Test
    void shouldAddNumbersCorrectly() {
        System.out.println("Running shouldAddNumbersCorrectly");
        basicCalculator.plus(3);
        basicCalculator.plus(8);
        assertEquals(110, basicCalculator.getResult());
    }

    @Test
    void shouldDivideNumbersCorrectly() {
        System.out.println("Running shouldDivideNumbersCorrectly");
        basicCalculator.plus(0.1);
        basicCalculator.plus(0.2);
        basicCalculator.divideBy(2);
        assertEquals(0.15, basicCalculator.getResult(), 0.000000000001);
    }

    @Test
    void shouldThrowExceptiononDivideByZero() {
        assertThrows(Exception.class, () -> {
           basicCalculator.divideBy(0);
        }, "Division by 0 should throw an exception");
    }

    @Test
    void shouldCompleteCalculationsWithinTimeLimit_incorrect() {
        // Mystery to be revealed next time - test fails on precision, not on duration
        assertTimeout(  Duration.of(1, ChronoUnit.MILLIS) , () -> {
            for(long i = 0; i <= 2_000_000_000L; i++) {
                basicCalculator.plus(0.1);
            }
            assertEquals(200_000_000L, basicCalculator.getResult());
        });
    }

    @Test
    void shouldCompleteCalculationsWithinTimeLimit() {
        double[] result = {0};
        assertTimeout(  Duration.of(5900, ChronoUnit.MILLIS) , () -> {
            for(long i = 0; i <= 2_000_000_000L; i++) {
                basicCalculator.plus(0.1);
            }
            result[0] = basicCalculator.getResult();
        });
        assertEquals(200_000_000L, result[0]);
    }
}
