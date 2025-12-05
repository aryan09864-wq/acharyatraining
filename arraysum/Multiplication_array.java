package arraysum;

public class Multiplication_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int[] arr = {3, 5, 9, 10, 12, 15}; // sample array
		        int count = 0;

		        for (int num : arr) {
		            if (num % 3 == 0) {
		                count++;
		            }
		        }

		        System.out.println(count);
		    }
						
	}

