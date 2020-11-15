import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        double startPopulation = 7.594e9;
        double currentPopulation  = 7.594e9;
        double newPopulation = currentPopulation;
        double growthRate = 1.0105;
        int doublePopulatedYear = 0;
        boolean found = false;

        String format = "%-4s %20s %20s %n";
        System.out.printf(format,"Year", "Population","Increase");
        System.out.printf(format,Integer.toString(2020),Double.toString(currentPopulation),Double.toString(0));
        for(int i = 1; i <= 75; i++){
            newPopulation = currentPopulation * growthRate;
            if(newPopulation > 2 * startPopulation && found == false){
                doublePopulatedYear = 2020 + i;
                found = true;
            }
            System.out.printf(format,Integer.toString(2020 + i),Double.toString(round(newPopulation,2)),Double.toString(round((newPopulation - currentPopulation),2)));
            currentPopulation = newPopulation;
        }

        System.out.println("The year in which Earth will be twice as populated as in 20020 is : " + doublePopulatedYear);



    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
