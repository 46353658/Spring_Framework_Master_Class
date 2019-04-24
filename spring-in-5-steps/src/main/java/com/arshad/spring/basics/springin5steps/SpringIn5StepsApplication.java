package com.arshad.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	// What are the beans? -> Marked with @Component
	// What are the dependencies of a bean? -> Marked with @Autowired
	// Where to search for beans? => No need because of @SpringBootApplication (current package and subpackages will be searched) 

	public static void main(String[] args) { 
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println("result: " + result);
	}

}
