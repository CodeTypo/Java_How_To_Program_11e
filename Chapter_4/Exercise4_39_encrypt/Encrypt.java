import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a 4 digit number: ");
        int input = sc.nextInt();
        while(input > 9999 || input < 1000){
            System.out.print("Please enter a valid 4 digit number: ");
            input = sc.nextInt();
        }

        int[] digits = new int [4];
        for(int i = 0; i < digits.length; i++){
            digits[digits.length - 1 - i] = input % 10;
            input /= 10;
        }

        digits = encrypt(digits);
        print(digits);

    }

    private static void print(int[] digits) {
        for(int digit : digits){
            System.out.print(digit);
        }
    }

    private static int[] encrypt(int[] digits) {
        int[] encrypted = new int[digits.length];
        for(int i = 0; i < digits.length; i++){
            encrypted[i] = (digits[i] + 7) % 10;
        }
        int temp = encrypted [0];
        encrypted[0] = encrypted [2];
        encrypted[2] = temp;
        temp = encrypted [1];
        encrypted [1] = encrypted[3];
        encrypted[3] = temp;
        return encrypted;
    }
}
