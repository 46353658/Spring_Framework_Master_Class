package com.arshad.spring.basics.springin5steps;

import com.arshad.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import com.arshad.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);

//                SpringApplication.run(SpringIn5StepsCdiApplication.class, args);

		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{} dao-{}", business, business.getSomeCdiDao());

//		System.out.println("business: " + business);


	}
}

/*--------------------SPRING BOOT---------------------*/

//package com.arshad.spring.basics.springin5steps;
//
//import com.arshad.spring.basics.springin5steps.cdi.SomeCdiBusiness;
//import com.arshad.spring.basics.springin5steps.scope.PersonDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//@SpringBootApplication
//public class SpringIn5StepsCdiApplication {
//
//	private static Logger LOGGER =
//			LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
//
//	public static void main(String[] args) {
//
//		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
//
//		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
//
//		LOGGER.info("{} dao-{}", business, business.getSomeCdiDao());
//
//	}
//}

