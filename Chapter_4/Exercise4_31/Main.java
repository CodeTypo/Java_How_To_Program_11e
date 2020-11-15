import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a five digit number: ");
        int input = sc.nextInt();
        while(input / 10000 < 0 ){
            System.out.print("Please input a five digit number: ");
            input = sc.nextInt();
        }

        int[] digits = new int[5];

        for(int i = 0; i < 5; i++){
            digits[i] = input % 10;
            input /=10;
        }

        if(digits[0] == digits[4] && digits[1] == digits[3]){
            System.out.println("This number is a pallindrome");
        }else{
            System.out.println("This is not a pallindrome");
        }
    }
}
