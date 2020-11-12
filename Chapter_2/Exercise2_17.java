import java.util.Scanner;

public class Exercise2_17{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("First number: ");
		int x = sc.nextInt();
		System.out.print("First number: ");
		int y = sc.nextInt();
		System.out.print("First number: ");
		int z = sc.nextInt();
		sc.close();
		int avg = (x + y + z) / 3;
		
		System.out.printf("The sum is: %d%n", x + y + z);
		System.out.println("The average is: " + avg);
		System.out.printf("The product is: %d%n", x * y * z);
		
		if ( x < y && x < z){
			System.out.println("The smallest one is: " + x);
		}
		
		if ( y < z && y < x){
			System.out.println("The smallest one is: " + y);
		}
		
		if ( z < y && z < x){
			System.out.println("The smallest one is: " + z);
		}
	
		if ( x > y && x > z){
			System.out.println("The biggest one is: " + x);
		}
		
		if ( y > z && y > x){
			System.out.println("The biggest one is: " + y);
		}
		
		if ( z > y && z > x){
			System.out.println("The biggest one is: " + z);
		}
	
	}// end of main
}// end of class Exercise2_17
