package com.arshad.spring.basics.springin5steps;

import com.arshad.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.arshad.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext =
					 new ClassPathXmlApplicationContext("applicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

			XmlPersonDAO personDao =
					applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
		}
	}
}
