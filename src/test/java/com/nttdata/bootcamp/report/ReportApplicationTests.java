package com.nttdata.bootcamp.report;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReportApplicationTests {

	@Test
	void contextLoads() {
		String test = "Test";
		Assertions.assertEquals("Test", test);
	}

}
