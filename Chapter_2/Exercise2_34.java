import java.util.Scanner;

public class Exercise2_34{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Please input current world population: ");
		double population = sc.nextDouble();
		System.out.print("Please input world's population annual growth rate [%]: ");
		double annualRate = sc.nextDouble();
		sc.close();
		
		double[] worldPopulation = new double[6];
		worldPopulation[0] = population;
		
		for(int i = 1; i < worldPopulation.length; i ++){
		worldPopulation[i] = worldPopulation[i - 1] += worldPopulation[i -1] * (annualRate / 100);
		System.out.printf("World population in %d [yrs]: %f%n",i,worldPopulation[i]);
		}
		
	}// end of main
}// end of class 