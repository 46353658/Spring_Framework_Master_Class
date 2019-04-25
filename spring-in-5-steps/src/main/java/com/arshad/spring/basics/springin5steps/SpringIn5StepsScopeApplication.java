package com.arshad.spring.basics.springin5steps;

import com.arshad.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.arshad.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());

	}
}
