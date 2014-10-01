package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void test() {
		String result = FizzBuzz.printFizzBuzz();
		assertEquals(412, result.length());
		assertEquals(countSubs(result, "Buzz"), 20);
	}

	/**
	 * Count the number of instances of substring within a string.
	 */
	private static int countSubs(final String string, final String substring) {
		int count = 0;
		int idx = 0;

		while ((idx = string.indexOf(substring, idx)) != -1) {
			idx++;
			count++;
		}

		return count;
	}
}
