package ru.dzhager3354.back_ci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackCiApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertEquals(5, 5);
	}

}
