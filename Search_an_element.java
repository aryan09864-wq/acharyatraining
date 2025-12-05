package arraysum;

public class Search_an_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {10, 20, 30, 40, 50};
		        int target = 50;
		        boolean found = false;

		        for (int num : arr) {
		            if (num == target) {
		                found = true;
		                break;
		            }
		        }

		        if (found)
		            System.out.println(target + " is present in the array.");
		        else
		            System.out.println(target + " is NOT present in the array.");
		    }
		

		
		    }


	


