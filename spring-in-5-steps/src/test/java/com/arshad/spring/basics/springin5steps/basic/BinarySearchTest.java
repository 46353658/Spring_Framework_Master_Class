package com.arshad.spring.basics.springin5steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.arshad.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario() {
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);
		assertEquals(3, actualResult);
		// call method on binarySearch
		// check if the value is correct
	}

}
