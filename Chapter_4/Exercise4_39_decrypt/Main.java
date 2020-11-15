import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// encrypted 1234 = 0189
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 4 digit number: ");
        int input = sc.nextInt();
        while(input > 9999){
            System.out.println("Please enter a valid 4 digit number: ");
            input = sc.nextInt();
        }

        int[] digits = new int[4];
        for(int i = 0; i < digits.length; i++){
            digits[digits.length - 1 -i] = input % 10;
            input /=10;
        }

        digits = decrypt(digits);
        print(digits);


    }

    private static void print(int[] digits) {
        for(int digit : digits){
            System.out.print(digit);
        }
    }

    private static int[] decrypt(int[] digits) {
        int[] decrypted = new int[digits.length];
        for(int i = 0; i < digits.length; i ++){
            decrypted[i] = (digits[i] + 3) % 10;
        }
        int temp = decrypted [0];
        decrypted [0] = decrypted [2];
        decrypted [2] = temp;
        temp = decrypted [1];
        decrypted [1] = decrypted [3];
        decrypted [3] = temp;

        return decrypted;
    }
}
