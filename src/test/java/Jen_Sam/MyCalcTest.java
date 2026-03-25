package Jen_Sam;

import static org.junit.Assert.*;

import org.junit.Test;

import MyPkg.MyCalc;

public class MyCalcTest {

	@Test
	public void test() {
		MyCalc calc = new MyCalc();
		assertEquals (40 , calc.sum(20,10));
	}

}
