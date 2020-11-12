import java.util.Scanner;

public class Exercise2_15{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int x = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int y = sc.nextInt();
		sc.close();
		
		System.out.printf("The sum is: %d%n", x + y);
		System.out.printf("The product is: %d%n", x * y);
		System.out.printf("The difference is: %d%n", x - y);
		System.out.printf("The quotient is: %d%n", x / y);
	}
}