package com.arshad.spring.basics.springin5steps.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.arshad.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class SomeCdiBusinessTest {

	@Autowired
	SomeCdiBusiness business;
	
	@Test
	public void testBasicScenario() {
		int actualResult = business.findGreatest();
		assertEquals(100, actualResult);
	}

}
