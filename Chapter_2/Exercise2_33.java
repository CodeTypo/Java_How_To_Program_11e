import java.util.Scanner;

public class Exercise2_33{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Please input Your weight [kg]: ");
		double weightKg = sc.nextDouble();
		System.out.print("Please input Your height [m]: ");
		double heightM = sc.nextDouble();
		sc.close();
		
		double bmi = weightKg / Math.pow(heightM, 2);
		
		if(bmi > 30){
			System.out.printf("Your BMI is: %.2f, Your category is: Obesity", bmi);
		}else if(bmi < 30 && bmi >= 25){
			System.out.printf("Your BMI is: %.2f, Your category is: Overweight", bmi);
		}else if(bmi < 25 && bmi >= 18.5){
			System.out.printf("Your BMI is: %.2f, Your category is: Normal weight", bmi);
		}else{ 
			System.out.printf("Your BMI is: %.2f, Your category is: Undeweight", bmi);
		}
		
		

	
	}// end of main
}// end of class 