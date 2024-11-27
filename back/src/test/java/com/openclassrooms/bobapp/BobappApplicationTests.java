package com.openclassrooms.bobapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BobappApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testfailure() {
		assertTrue(false);
	}

}
