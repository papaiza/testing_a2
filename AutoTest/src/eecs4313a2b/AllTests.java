package eecs4313a2b;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IsAfterTest.class, MinuteStringTest.class })
public class AllTests {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(EECS4313A2AllBlackBoxTests.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("All tests passed? " + result.wasSuccessful());

	}
}
