package acharyajava;
import java.util.Scanner;
public class Greate_Number {

	
		 public static void isSix(int Number1, int Number2) {
			 boolean result = false;
		        if (Number1 == 6 || Number2 == 6 || (Number1 + Number2 )== 6) {
		        	result=true;
		        }
		        System.out.println("result : "+result);
		        
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input two integers
		        System.out.print("Enter first number: ");
		        int Number1 = scanner.nextInt();

		        System.out.print("Enter second number: ");
		        int Number2 = scanner.nextInt();

		        // Check and display result
		          isSix(Number1,Number2);
		      

		    
	}

}
