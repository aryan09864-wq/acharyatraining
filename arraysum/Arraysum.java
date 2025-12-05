package arraysum;

import java.util.Scanner;

public class Arraysum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Take array elements
        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Take number to search
        System.out.print("Enter the number to search: ");
        int searchNum = sc.nextInt();

        // Search logic
        boolean found = false;
        for (int value : arr) {
            if (value == searchNum) {
                found = true;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Number " + searchNum + " is PRESENT in the array.");
        } else {
            System.out.println("Number " + searchNum + " is NOT PRESENT in the array.");
        }

        sc.close();
    
	

	}

}
