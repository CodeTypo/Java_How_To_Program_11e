import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a square (1 - 20) : ");
        int size = sc.nextInt();
        sc.close();

        if(size == 1){
            System.out.println("*");
        } else if(size == 2){
            System.out.printf("**%n**");
        }else if(size > 2 && size <= 40){
            printRow(size);
            for(int i = 0; i < size - 2; i++){
                printMidFragment(size);
            }
            printRow(size);
        }



    }

    private static void printMidFragment(int size) {
        System.out.printf("* ");
        for(int i = 0; i < size - 2; i ++){
            System.out.print("  ");
        }
        System.out.printf("*%n");
    }

    private static void printRow(int size) {
        for(int i = 0; i < size ; i++){
            System.out.printf("* ");
        }
        System.out.printf("%n");
    }


}
