package com.cenfotec.examen.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.cenfotec.examen.obj.Analytics;

public class TestAnalytics {

	@Test
	public void testMasLargaFunction() {
		String testList = "casa,casita,casatota";
		String[] result = Analytics.masLarga(testList);
		assertEquals("[casatota]", Arrays.toString(result), "Result is not as expected.");
	}
	
	@Test
	public void testMasCortaFunction() {
		String[] result = Analytics.masCorta("casa,mia,cosa,ala");
		assertEquals("[ala, mia]", Arrays.toString(result), "Result is not as expected.");
	}
	@Test
	public void testMasLargaAbc() {
		String testList = "ala,pepe,casa";
		String[] result = Analytics.masLarga(testList);
		assertEquals("[casa, pepe]", Arrays.toString(result), "Result is not as expected.");
	}
	
	@Test
	public void testMasCortaAbc() {
		String testList = "casita,hola,cosa";
		String[] result = Analytics.masCorta(testList);
		assertEquals("[cosa, hola]", Arrays.toString(result), "Result is not as expected.");
	}
	
	@Test
	public void testPrimeraMasLarga() {
		String testList = "sol,hola,pepe";
		String[] result = Analytics.primeraMasLarga(testList);
		assertEquals("[hola]", Arrays.toString(result), "Result is not as expected.");
	}
	
}
