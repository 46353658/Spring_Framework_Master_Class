
package com.arshad.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AssertTest {
	
	@Test
	public void test() {
		assertEquals(1,1);
		assertNotEquals(1,2);
		boolean condn = true;
		assertTrue(condn);
		assertFalse(!condn);
		assertNotNull(1);
		assertNull(null);
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}
	

}
