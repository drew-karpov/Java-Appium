package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.SomeTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        SomeTest.class
})

public class TestSuite {
}