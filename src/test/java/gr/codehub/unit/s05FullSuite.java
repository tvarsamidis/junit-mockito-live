package gr.codehub.unit;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("gr.codehub.unit")
@ExcludePackages({"gr.codehub.unit.other"})
@IncludeClassNamePatterns("^.*Test$")
@IncludeTags("v2.4")
@ExcludeTags("version for Italy")
public class s05FullSuite {
}
