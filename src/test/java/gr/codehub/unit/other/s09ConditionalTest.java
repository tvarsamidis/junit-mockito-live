package gr.codehub.unit.other;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class s09ConditionalTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void shouldExecuteOnWindows() {
        System.out.println("This is a Windows test");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void shouldExecuteOnLinux() {
        System.out.println("This is a Linux test");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_17, JRE.JAVA_21, JRE.OTHER})
    @EnabledForJreRange(min = JRE.JAVA_17)
    void shouldExecuteInJava17OrMore() {
        System.out.println("This is a Java JRE-dependent test");
    }

    @Test
    @EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*")
    public void shouldRunIfVendorIsOracle() {
        // Only enabled if the JVM vendor is Oracle
    }

    // [ and ] define a character class, meaning it will match any of the characters inside the brackets.
    // / inside the brackets matches the Unix-based file separator /
    @Test
    @DisabledIfSystemProperty(named = "file.separator", matches = "[/]") // line separator, path separator etc
    public void shouldSkipIfFileSeparatorIsSlash() {
        // Disabled if the system running supports "/" as its file separator
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "GDMSESSION", matches = "ubuntu")
    public void shouldRunOnUbuntuEnvironment() {
        // Only enabled if the environment variable "GDMSESSION" equals "ubuntu"
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "LC_TIME", matches = ".*UTF-8.")
    public void shouldSkipIfTimeIsNotUTF8() {
        //  Disabled if the environment variable "LC_TIME" does not equal "*UTF-8.". Practically means it will not
        //  run if the time is not based on UTF8
    }


    @Test
    @Disabled("Disable until June 2026")
    void onlyRunAfterJune2026() {
        // Check if truly disabled
        assertTrue(1==1);
    }
}
