package acharyajava;
import java.util.Scanner;
public class Two_Dimensonal_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int arr[][] = new int [3][4];
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0 ; j < arr[i].length; j++) {
			System.out.println("enter the value of rows" +(i+1)+" and column " +(j+1));
			arr[i][j] = scan.nextInt();
		}
		
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j= 0; j < arr [i].length ; j++) {
				System.out.print(arr[i] [j]+ " ");
				
			}
			System.out.println();
	}
		

}
	
}
	