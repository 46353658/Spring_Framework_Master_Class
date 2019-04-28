package com.arshad.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void testSize() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10);
		
		assertEquals(10, listMock.size());
	}
	
	@Test
	public void testSize_multipleReturns() {
		List listMock = mock(List.class);
		
		// return 10 the first time size() is called,
		// return 20 the second time size() is called etc ...
		when(listMock.size())
			.thenReturn(10)
			.thenReturn(20)
			.thenReturn(50);
		
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
		assertEquals(50, listMock.size());
	}
	
	@Test
	public void testGet_SpecificParameter() {
		List listMock = mock(List.class);
		
		when(listMock.get(0))
			.thenReturn("SomeString");
		
		assertEquals("SomeString", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}

	@Test
	public void testGet_GenericParameter() {
		List listMock = mock(List.class);
		
		when(listMock.get(Mockito.anyInt()))
			.thenReturn("SomeString");
		
		assertEquals("SomeString", listMock.get(0));
		assertEquals("SomeString", listMock.get(1));
	}

}
