import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int biggestSoFar = 0;

        while(counter < 10){
            System.out.print("Please input a number: ");
            int number = sc.nextInt();
            if(number > biggestSoFar){
                biggestSoFar = number;
            }
            counter++;
        }
        sc.close();
        System.out.println("The biggest of all the entered numbers is: " + biggestSoFar);

    }
}
