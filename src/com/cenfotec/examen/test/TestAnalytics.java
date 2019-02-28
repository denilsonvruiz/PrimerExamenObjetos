package com.cenfotec.examen.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.cenfotec.examen.obj.Analytics;

public class TestAnalytics {

	@Test
	public void testMasLargaFunction() {
		String[] testList = new String[3];
		testList[0] = "casa";
		testList[1] = "casita";
		testList[2] = "casatota";
		String[] result = Analytics.masLarga(testList);
		assertEquals("[casatota]", Arrays.toString(result), "Result is not as expected.");
	}
	
	@Test
	public void testMasCortaFunction() {
		String[] testList = new String[4];
		testList[0] = "casa";
		testList[1] = "mia";
		testList[2] = "cosa";
		testList[3] = "ala";
		String[] result = Analytics.masCorta(testList);
		assertEquals("[ala, mia]", Arrays.toString(result), "Result is not as expected.");
	}
	@Test
	public void testMasLargaAbc() {
		String[] testList = new String[3];
		testList[0] = "ala";
		testList[1] = "pepe";
		testList[2] = "casa";
		String[] result = Analytics.masLarga(testList);
		assertEquals("[casa, pepe]", Arrays.toString(result), "Result is not as expected.");
	}
	
}
