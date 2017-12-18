package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcreast.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 *@author George Almazov (try_again34@tuta.io)
 *@version $Id$
 *@since 0.1
 */
public class CalculateTest {
	/**
	 * Test echo.
	 */ @Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Petr Arsentev";
		String expect = "Echo, echo, echo : Petr Arsentev";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result,is(expect));
	}
}
