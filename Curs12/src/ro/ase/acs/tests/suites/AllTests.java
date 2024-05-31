package ro.ase.acs.tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.classes.Operations;
import ro.ase.acs.tests.OperationsTests;
import ro.ase.acs.tests.OtherOperationsTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({OperationsTests.class, OtherOperationsTests.class})
public class AllTests {
}
