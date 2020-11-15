import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the binary number: ");
        String binary = sc.next();
        sc.close();
        char[]binaryDigits = binary.toCharArray();

        int decimal = 0;

        for(int i = 0; i < binaryDigits.length; i++){
            if(binaryDigits[i] == '1')
            decimal += Math.pow(2,i);
        }

        System.out.println("The decimal value is: "+decimal);

    }
}
