package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyAppTest {
	@Test
	public void sumTest(){
		MyCalculator calculator = new MyCalculator();
		Assertions.assertEquals(11,  calculator.sum(5,6));
	}
}
