package oppg2oving6;

import java.util.Random;
import oppg2oving6.SorteringsMetoder;

public class TidsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random tilfeldig = new Random();
			int n = 32000;
			int antal = 10;
			
			Integer[][] a = new Integer[antal][n];
			
			for(int i = 0; i < antal; i++) {
				for(int j = 0; j < n; j++) {
					a[i][j] = tilfeldig.nextInt();
				}
			}
			long start = System.currentTimeMillis();
			for (int i = 0; i < antal; i++) {
				sort(a[i],0,n);
			}
			long slutt = System.currentTimeMillis();
			long tid = slutt - start;
	        System.out.println("test: " + tid + " ms");
	}

}
