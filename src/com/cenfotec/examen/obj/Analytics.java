package com.cenfotec.examen.obj;
import java.util.ArrayList;

public class Analytics {
	public static String[] masLarga(String[] palabras) {
		int lastSizeWord = -1;
		ArrayList<String> longestWords = new ArrayList<String>();
		for(int i=0; i<palabras.length; i++) {
			if(palabras[i].length() == lastSizeWord) {
				longestWords.add(palabras[i]);
				lastSizeWord = palabras[i].length();
			}
			if(palabras[i].length() > lastSizeWord) {
				longestWords = new ArrayList<String>();
				longestWords.add(palabras[i]);
				lastSizeWord = palabras[i].length();
			}
		}
		String[] arrPalabras = new String[longestWords.size()];
		for(int i=0; i<longestWords.size(); i++) {
			arrPalabras[i] = longestWords.get(i);
		}
		return arrPalabras;
	}
}
