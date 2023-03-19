package oppg2oving6;

public class SorteringsMetoder {
	
	
	public static void insertionSort(int[] arr) {
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
	
	public static void selectionSort(int[] arr) {
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
	
	
}

