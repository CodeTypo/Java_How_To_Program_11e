import java.util.Scanner;

public class Exercise2_16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("The first number: ");
		int x = sc.nextInt();
		System.out.print("The second number: ");
		int y = sc.nextInt();
		sc.close();
		
		if(x > y){
			System.out.println(x + " is larger");
		}
		
		else if(x < y){
			System.out.println(y + " is larger");
		}
		
		else{
		System.out.println("These number are equal");
		}
	
	}//end of main
}//end of class