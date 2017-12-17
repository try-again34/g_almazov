package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcreast.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 @author George Almazov (try_again34@tuta.io)
 @version $Id$
 @since 0.1
 */
 
public class CalculateTest {
	/**
	 *
	 * Test add.
	 */
	@Test
	public void whenAddOneToOneThenTwo() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		asserThat (
			out.toString(),
			is(
				String.format(
					"Hello World%s",
					System.getProperty("line.separator")
				)
			)	
		);
	}
}
	