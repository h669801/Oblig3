package oppg2oving6;

import java.util.Random;

import src.no.hvl.dat102.SorterTabell;

public class SorteringsMetoder {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Random tilfeldig = new Random();
//			int n = 1000;
//			int antal = 10;
//			
//			Integer[][] a = new Integer[antal][n];
//			
//			for(int i = 0; i < antal; i++) {
//				for(int j = 0; j < n; j++) {
//					a[i][j] = tilfeldig.nextInt();
//				}
//			}
//			long start = System.currentTimeMillis();
//			for (int i = 0; i < antal; i++) {
//				sort(a[i],0,a.length-1);
//			}
//			long slutt = System.currentTimeMillis();
//			long tid = slutt - start;
//	        System.out.println("test: " + tid + " ms");
//	        System.out.println(a);
		
		int n = 32000;
	    Integer[] data = new Integer[n];
	    for (int i = 0; i < n; i++) {
	        data[i] = (int) (Math.random() * n);
	    }
	    long start = System.currentTimeMillis();
        sort(data,0, data.length-1);
        long slutt = System.currentTimeMillis();
        long tid = slutt - start;
        System.out.println("test: " + tid + " ms");
//        System.out.println(data);
        
        // Bruk dette for å se at metodene fungerer som de skal.
//        System.out.print("[ ");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + " ");
//        }
//        System.out.println("]");
	}
	
	
	public static void insertionSort(Integer[] arr) {
	    int n = arr.length;
	    for (int i = 1; i < n; ++i) {
	        int k = arr[i];
	        int j = i - 1;

	        while (j >= 0 && arr[j] > k) {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = k;
	    }
	}
	
	public static void selectionSort(Integer[] arr) {
	    int n = arr.length;

	    for (int i = 0; i < n-1; i++) {
	        int min_indeks = i;
	        for (int j = i+1; j < n; j++) {
	            if (arr[j] < arr[min_indeks]) {
	                min_indeks = j;
	            }
	        }
	        int temp = arr[min_indeks];
	        arr[min_indeks] = arr[i];
	        arr[i] = temp;
	    }
	}
	
	
	public static void swap(Integer[] tab, int i, int j) {
		int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
	}
	
	public static void quickSort(Integer[] arr, int low, int high) {
	    if (low < high) {
	        int pi = partering(arr, low, high);

	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}

	private static int partering(Integer[] arr, int low, int high) {
	    int pivot = arr[high];
	    int i = (low - 1);

	    for (int j = low; j < high; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	            swap(arr,i,j);
	        }
	    }
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
	    return i + 1;
	}
	
	public static void merge(Integer arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
  
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
	}
	
	public static void sort(Integer arr[], int l, int r){
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
	
}

