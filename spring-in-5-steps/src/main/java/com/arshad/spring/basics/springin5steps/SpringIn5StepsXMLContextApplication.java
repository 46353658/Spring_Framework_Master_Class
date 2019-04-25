package com.arshad.spring.basics.springin5steps;

import com.arshad.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.arshad.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXMLContextApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext =
					 new ClassPathXmlApplicationContext("applicationContext.xml")) {

			applicationContext.getBeanDefinitionNames()
			XmlPersonDAO personDao =
					applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection());
		}
	}
}
