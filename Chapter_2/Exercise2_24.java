import java.util.Scanner;

public class Exercise2_24{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbs = new int[5];
		
		for (int i = 0; i < 5; i ++){
			System.out.print("Input number " + (i +1) +": ");
			numbs[i] = sc.nextInt();
		}
		
		sc.close();
		
		int tempMin = 0;
		int tempMax = 0;
		
		for(int i = 0; i <5; i++){
			if(i ==0){
				tempMax = tempMin = numbs[i];
			}
			
			if(numbs[i] > tempMax){
				tempMax = numbs[i];
			}
			
			if(numbs[i] < tempMin){
				tempMin = numbs[i];
			}
		}
		
		System.out.println("the lowest one is: " + tempMin);
		System.out.println("the highest one is: " + tempMax);
	
	}//end of main
}//end of class
