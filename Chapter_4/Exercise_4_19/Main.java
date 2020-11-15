import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] items =  new double[][]{ {1, 239.99},
                                            {2, 129.75},
                                            {3, 99.95},
                                            {4, 350.89}};
        System.out.println("Please input the name of salesman You want to create: ");
        String name = sc.nextLine();
        Salesman s1 = new Salesman(name);

        for(int i = 0; i < items.length; i++){
            System.out.printf("Items of ID: %d sold by %s: ",i + 1,s1.getName());
            int amount = sc.nextInt();
            s1.sold(amount, items[i][1]);
        }
        sc.close();
        System.out.printf("Salesman %s earnings: %.2f", s1.getName(), s1.getMoney());

    }
}
