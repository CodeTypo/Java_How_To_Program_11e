import java.util.Scanner;

public class Exercise2_30{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a five digit number: ");
		int x = sc.nextInt();
		sc.close();
		int[] digits = new int[5];
		
		for(int i = 1; i < 6; i++){
			digits[digits.length - i] = x % 10;
			x /= 10;
		}
		
		for(int digit : digits){
			System.out.printf("%d   ", digit);
		}
	
	}//end of main
}//end of class