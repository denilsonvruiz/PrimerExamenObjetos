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
		System.out.println(testList.length);
		System.out.println(Arrays.toString(result));
		assertEquals("casatota", result[0], "Result is not as expected");
	}
}
