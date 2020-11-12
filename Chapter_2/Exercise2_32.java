import java.util.Scanner;

public class Exercise2_32{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input five numbers: ");
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i ++){
		nums[i] = sc.nextInt();
		}
		
		sc.close();
		
		int positive = 0;
		int negative = 0;
		int zeroes = 0;
		
		for(int num : nums){
		if(num > 0)
			positive ++;
		else if(num < 0)
			negative++;
		else
			zeroes++;
		}

		System.out.printf("negative: %d positive:%d zeroes: %d", negative, positive, zeroes);
	
	}//end of main
}//end of class