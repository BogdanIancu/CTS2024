package ro.ase.acs.tests.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.OperationsTests;
import ro.ase.acs.tests.OtherOperationsTests;
import ro.ase.acs.tests.categories.ImportantTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({OperationsTests.class, OtherOperationsTests.class})
@Categories.IncludeCategory(ImportantTest.class)
public class JustImportantTests {
}
