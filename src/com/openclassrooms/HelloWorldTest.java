package com.openclassrooms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	public void testSum() {
		HelloWorld testHelloWorld = new HelloWorld();
		int somme = testHelloWorld.sum(2, 3);
		assertEquals(5, somme);
	}

}
