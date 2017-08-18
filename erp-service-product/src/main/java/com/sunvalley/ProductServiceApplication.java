package com.sunvalley;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class ProductServiceApplication {
	private static Logger logger = LoggerFactory.getLogger(ProductServiceApplication.class);
	public static void main(String[] args) {
		logger.info("11111111111111111111111111111");
		SpringApplication.run(ProductServiceApplication.class, args);

	}
}
