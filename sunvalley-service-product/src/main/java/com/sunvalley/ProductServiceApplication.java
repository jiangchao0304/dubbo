package com.sunvalley;
import com.sunvalley.erp.daoEX.product.SequenceExMapper;
import com.sunvalley.erp.model.product.Sequence;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
@MapperScan({"com.sunvalley.erp.dao.product","com.sunvalley.erp.daoEX.product"})
@EnableTransactionManagement
public class ProductServiceApplication {
	private static Logger logger = LoggerFactory.getLogger(ProductServiceApplication.class);


	public static void main(String[] args) {

		ConfigurableApplicationContext cac = SpringApplication.run(ProductServiceApplication.class, args);

		SequenceExMapper sequenceExMapper = (SequenceExMapper)cac.getBean("sequenceExMapper");

		Sequence sq = new Sequence();
		sq.setName("test");

		int ss = sequenceExMapper.getSeq(sq);

		logger.info("server start");

	}
}
