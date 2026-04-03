package gr.codehub.unit;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Selected Classes Suite")
//@SelectClasses({s01TestInfoDemo.class, s03BasicCalculatorTest.class, s02GenericTest.class})
@SelectPackages("gr.codehub.unit")
public class s05GenericSuite {
}
