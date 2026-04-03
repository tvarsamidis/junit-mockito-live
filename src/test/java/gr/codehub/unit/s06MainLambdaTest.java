package gr.codehub.unit;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class s06MainLambdaTest {

    @ParameterizedTest
    @ValueSource(strings={"test", "data", "string"})
    void shouldValidateStringLengthIsGreaterThanZero(String input) {
        System.out.println("Now testing for " + input);
        assertTrue(input.length() > 0);
    }

    @TestFactory
    Collection<DynamicTest> shouldReturnDynamicTests() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Test1", () -> {assertEquals(2, 1);})   ,
                DynamicTest.dynamicTest("Test2", () -> assertTrue("java".contains("j")))
        );
    }
}
