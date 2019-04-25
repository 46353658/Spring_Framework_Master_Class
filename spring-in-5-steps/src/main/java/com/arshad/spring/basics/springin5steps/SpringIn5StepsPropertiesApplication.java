package com.arshad.spring.basics.springin5steps;

import com.arshad.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.arshad.spring.basics.springin5steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(
							 SpringIn5StepsPropertiesApplication.class)) {

			SomeExternalService service =
					applicationContext.getBean(SomeExternalService.class);

			System.out.println(service);
			System.out.println("URL: " + service.returnServiceURL());
		}
	}
}
