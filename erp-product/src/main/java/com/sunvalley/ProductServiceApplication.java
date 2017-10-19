package com.sunvalley;
import com.sunvalley.erp.common.util.ConfigUtil;
import com.sunvalley.erp.product.daoEX.SequenceExMapper;
import com.sunvalley.erp.product.model.Sequence;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan({"com.sunvalley.erp.product.dao","com.sunvalley.erp.product.daoEX"})
//@EnableTransactionManagement
@EnableEurekaClient
public class ProductServiceApplication {
	private static Logger logger = LoggerFactory.getLogger(ProductServiceApplication.class);


	public static void main(String[] args) {


		ConfigurableApplicationContext cac = SpringApplication.run(ProductServiceApplication.class, args);


		logger.info("server start");

//		SequenceExMapper sequenceExMapper = (SequenceExMapper)cac.getBean("sequenceExMapper");
//
//		Sequence sq = new Sequence();
//		sq.setName("test");
//
//		int ss = sequenceExMapper.getSeq(sq);




	}
}
