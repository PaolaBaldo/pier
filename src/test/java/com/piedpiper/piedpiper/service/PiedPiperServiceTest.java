package com.piedpiper.piedpiper.service;

import org.hamcrest.CoreMatchers;
import org.junit.*;

import com.piedpiper.piedpiper.model.DeafRatsEntity;

public class PiedPiperServiceTest {
	
	@Test
	public void testGetDeafRats_0() {
		PiedPiperService piedPiperService = new PiedPiperService();
		DeafRatsEntity deafRatsEntity = piedPiperService.getDeafRats("~O~O~O~OP");
		Assert.assertThat(deafRatsEntity.getDeafRatsQuantity(), CoreMatchers.is(0));
	}

	@Test
	public void testGetDeafRats_1() {
		PiedPiperService piedPiperService = new PiedPiperService();
		DeafRatsEntity deafRatsEntity = piedPiperService.getDeafRats("PO~O~~OO~");
		Assert.assertThat(deafRatsEntity.getDeafRatsQuantity(), CoreMatchers.is(1));
	}
	
	
	@Test
	public void testGetDeafRats_2() {
		PiedPiperService piedPiperService = new PiedPiperService();
		DeafRatsEntity deafRatsEntity = piedPiperService.getDeafRats("~OO~~O~OPO~~OO~");
		Assert.assertThat(deafRatsEntity.getDeafRatsQuantity(), CoreMatchers.is(2));
	}
	
	

}
