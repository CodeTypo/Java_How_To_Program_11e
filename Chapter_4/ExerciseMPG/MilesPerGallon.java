import java.util.Scanner;
public class MilesPerGallon {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input miles driven or -1 to exit: ");
		double milesDriven = sc.nextDouble();
		double totalMiles = 0;
		double totalGallons = 0;
		int tripCounter = 0;
		
		while(milesDriven != (-1)){
			System.out.print("Please input gallons used or -1 to exit: ");
			double gallonsUsed = sc.nextDouble();
			
			if(gallonsUsed != ( -1)){
				totalGallons += gallonsUsed;
				totalMiles += milesDriven;
				tripCounter++;
				System.out.println();
				System.out.println("Trip " + tripCounter + ": miles driven: " + milesDriven + ", gallons used: " + gallonsUsed);
				System.out.println();
			}
			
			System.out.print("Please input miles driven or -1 to exit: ");
			milesDriven = sc.nextDouble();
		}
		
		if(tripCounter > 0){
			System.out.printf("%nTotal miles driven : %.2f %nTotal gallons used: %.2f %nTrips done: %d %nAverage MPG: %.2f",
			totalMiles, totalGallons, tripCounter, totalMiles / totalGallons);
		} else{
		System.out.println("You did not input any data");
		}
		
	}
}