package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitFunction junit=new jUnitFunction();
		int res=junit.addNumbers(100,400);
		assertEquals(500,res);
	}

}
