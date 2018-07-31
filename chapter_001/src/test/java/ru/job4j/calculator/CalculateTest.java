package ru.job4j.calculator;

import org.junit.Test;
import ru.job4j.calculate.Calculate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Aleksey Siminko (mailto:alekseysimink@gmail.com)
* @version $Id$
* @since 0.1
*/
public class CalculateTest {

    @Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Aleksey Siminko";
    String expect = "Echo, echo, echo : Aleksey Siminko";
    Calculate calculate = new Calculate();
    String result = calculate.echo(input);
    assertThat(result, is(expect));
 }
 
}