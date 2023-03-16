package src.no.hvl.dat102;

public class SorterTabell {
	// Byter om a[i] og a[j]. Antar at b�de i og j er lovlege indeksar i tabellen.
		private static void swap(Object[] a, int i, int j) {
			Object temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		// Utvalgssortering / Plukksortering (DAT100) (Selction sort)
		// Sorterer dei f�rste n elmementa i tabellen. Kanskje litt uvanlig
		// Kunne ogs� utelatt n og sortert heile tabellen.

		public static <T extends Comparable<? super T>> void utvalgssortering(T[] a, int n) {
			for (int i = 0; i < n - 1; i++) {
				int minstePos = i;
				for (int j = i + 1; j < n; j++) {
					if (a[j].compareTo(a[minstePos]) < 0) {
						minstePos = j;
					}
				}
				
				swap(a, i , minstePos);
			}
		}

		// Sortering ved innsetting (Insertion sort)
		public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a, int n) {
			sorteringVedInssetting(a, 0, n - 1);
		}

		// Sorterer ein del av tabellen, start ... slutt (begge grensene er med)
		public static <T extends Comparable<? super T>> void sorteringVedInssetting(T[] a, int start, int slutt) {
//			int min = start;
			
			int minIndeks = start;
		    for (int i = start + 1; i <= slutt; i++) {
		        if (a[i].compareTo(a[minIndeks]) < 0) {
		            minIndeks = i;
		        }
		    }
		    T tmp = a[minIndeks];
		    for (int i = minIndeks; i > start; i--) {
		        a[i] = a[i - 1];
		    }
		    a[start] = tmp;
			
			for (int i = start + 1; i <= slutt; i++) {
				tmp = a[i];
				int j = i - 1;  // siste i sortert del
				boolean ferdig = false;
				
				while (!ferdig && j >= 0) {
					if (tmp.compareTo(a[j]) < 0) {
						a[j + 1] = a[j];
						j--;
					} else {
						ferdig = true;
					}
				}
				
				a[j + 1] = tmp;
			}
			
//			int minIndex = start;
//		    for (int i = start + 1; i <= slutt; i++) {
//		        if (a[i].compareTo(a[minIndex]) < 0) {
//		            minIndex = i;
//		        }
//		    }
//		    if (minIndex != start) {
//		        T tmp = a[start];
//		        a[start] = a[minIndex];
//		        a[minIndex] = tmp;
//		    }
//
//		    for (int i = slutt; i > start; i--) {
//		        if (a[i].compareTo(a[i-1]) < 0) {
//		            T tmp = a[i];
//		            a[i] = a[i-1];
//		            a[i-1] = tmp;
//		        }
//		    }
//
//		    for (int i = start + 2; i <= slutt; i++) {
//		        T tmp = a[i];
//		        int j = i - 1;  // siste i sortert del
//		        while (tmp.compareTo(a[j]) < 0) {
//		            a[j + 1] = a[j];
//		            j--;
//		        }
//		        a[j + 1] = tmp;
//		    }
		} 
}
