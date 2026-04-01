package gr.codehub.unit.other;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Tests for startup setup")
public class s01TestInfoDemo {

    @Test
    void testInfoDemo(TestInfo testInfo, int x) {
        // expects "testInfoDemo(TestInfo)"
        assertEquals("testInfoDemo(TestInfo)", testInfo.getDisplayName());
    }

    @Test
    @DisplayName("More complete test")
    @Tag("v2.4")
    void testInfoDemo2(TestInfo testInfo) {
        assertTrue(testInfo.getTags().contains("v2.3"), "Must be running v2.3");
        assertEquals("More complete test", testInfo.getDisplayName());
    }
}
