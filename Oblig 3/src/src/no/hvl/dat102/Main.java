package src.no.hvl.dat102;

import java.lang.Math;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Integer[] tab = {7, 4, 1, 9, 5, 2};
		// String[] tab2 = {"b", "a"};
		
		int n = 50000;
	    Integer[] data = new Integer[n];
	    for (int i = 0; i < n; i++) {
	        data[i] = (int) (Math.random() * n);
	    }
	    
//		Random tilfeldig = new Random(); 
//		int n = 32000; 
//		int antal = 10; 
//		 
//		Integer[] a = new Integer[n]; 
//		 
//		// set inn tilfeldige heiltal i alle rekker 
//		for (int i = 0; i < antal; i++){ 
////		for (int j = 0; j < n; j++){ 
//		a[i] = tilfeldig.nextInt(); 
//		} 
		 
		// start tidsmåling 
//		for (int i = 0; i < antal; i++){ 
//		SorterTabell.sorteringVedInssetting(a, a.length); // blir ein eindimensjonal tabell 
//		}         
		// slutt tidsmåling
		
		long start = System.currentTimeMillis();
        SorterTabell.sorteringVedInssetting(data, n);
        long slutt = System.currentTimeMillis();
        long tid = slutt - start;
        System.out.println("test: " + tid + " ms");
		
		// SorterTabell.utvalgssortering(tab, tab.length);
//		SorterTabell.sorteringVedInssetting(data, data.length);
		
//		for (Integer e : data) {
//			System.out.print(e + " ");
//		}
		
		System.out.println();

	}
}
