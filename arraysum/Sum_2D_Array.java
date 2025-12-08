package acharyajava;
import java.util.Scanner;
public class Sum_2D_Array {

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
		int sum=0 ;
		for (int i = 0; i < arr.length; i++) {
			for (int j= 0; j < arr [i].length ; j++) {
				sum =sum +arr[i][j];
			}
				System.out.println();
			}
			System.out.println("the total suum of array element is "+sum);
	}

}
