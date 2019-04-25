package com.arshad.spring.basics.springin5steps;

import com.arshad.spring.basics.componentscan.ComponentDAO;
import com.arshad.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.arshad.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);


	}
}
