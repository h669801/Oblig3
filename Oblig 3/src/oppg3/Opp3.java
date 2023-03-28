package oppg3;

public class Opp3 {
	public static boolean linearSearchUnsorted(int[] arr, int target) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == target) {
	            return true;
	        }
	    }
	    return false;
	}

	public static void main(String[] args) {
	    // Test 1a: Test med en tom tabell.
	    int[] tab1 = {};
	    int[] tab2 = {5};
	    int[] tab3 = {1, 2, 3};
//	    int[] tab4 = {1, 2, 3};
	    
	    boolean result1 = linearSearchUnsorted(tab1, 5);
	    System.out.println(result1); // Forventet output: false
	    
	    // Test 1b: Test med en tabell med ett element.
	    
	    boolean result2 = linearSearchUnsorted(tab2, 5);
	    System.out.println(result2); // Forventet output: true
	    
	    // Test 1c: Test med en tabell der elementet finnes i starten, midten og på slutten av tabellen.
	    
	    boolean result3a = linearSearchUnsorted(tab3, 1);
	    boolean result3b = linearSearchUnsorted(tab3, 3);
//	    boolean result3c = linearSearchUnsorted(tab3, 5);
	    System.out.println(result3a); // Forventet output: true
	    System.out.println(result3b); // Forventet output: true
//	    System.out.println(result3c); // Forventet output: true
	    
	    // Test 1d: Test med en tabell der elementet ikke finnes i tabellen.
	    
	    boolean result4 = linearSearchUnsorted(tab3, 6);
	    System.out.println(result4); // Forventet output: false
	}
}
