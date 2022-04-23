package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunction junit=new jUnitFunction();
		String res=junit.addStrings("Shristi Agarwal,","E20CSE480");
		assertEquals("Shristi Agarwal,E20CSE480",res);
	}

}
