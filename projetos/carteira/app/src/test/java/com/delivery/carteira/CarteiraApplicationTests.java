package com.delivery.carteira;

import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.DockerComposeContainer;

import java.io.File;

@SpringBootTest
class CarteiraApplicationTests {

	@ClassRule
	public static DockerComposeContainer environment =
			new DockerComposeContainer(new File("src/test/resources/compose-test.yml"))
					.withExposedService("redis_1", 100)
					.withExposedService("elasticsearch_1", 100);

	@Test
	void contextLoads() {
	}

}
