package com.sunvalley;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
@MapperScan({"com.sunvalley.erp.dao.product","com.sunvalley.erp.daoEX.product"})
@EnableTransactionManagement
public class ProductServiceApplication {
	private static Logger logger = LoggerFactory.getLogger(ProductServiceApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(ProductServiceApplication.class, args);

		logger.info("server start");

	}
}
