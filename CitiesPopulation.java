package Homeworks;

import java.util.Scanner;

public class CitiesPopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls enter a population: ");
        int population = scanner.nextInt();

        System.out.print("Pls enter a country ID: ");
        String countryId = scanner.next();  // FRANCE, GERMANY

        scanner.close();

        if (countryId.equals("GERMANY")) {
            if (population > 0 && population <= 100_000)
                System.out.println("It's a small town in Germany");
            else if (population >= 100_000 && population <= 400_000)
                System.out.println("It's a middle town in Germany");
            else if (population >= 400_000 && population <= 1_000_000)
                System.out.println("This city in Germany has an unknown data of population");
            else if (population >= 1_000_000)
                System.out.println("It's a big city in Germany");
            else
                System.out.println("It's a wrong data of population");

        } else if (countryId.equals("FRANCE")) {
            if (population > 0 && population <= 200_000)
                System.out.println("It's a small town in France");
            else if (population >= 200_000 && population <= 500_000)
                System.out.println("It's a middle town in France");
            else if (population >= 400_000 && population <= 1_000_000)
                System.out.println("This city in France has an unknown data of population");
            else if (population >= 1_500_000)
                System.out.println("It's a big town in France");
            else
                System.out.println("It's a wrong data of population");
        } else {
            System.out.println("It's a wrong countries ID ");
        }
    }
}


