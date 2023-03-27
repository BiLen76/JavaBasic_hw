package Homeworks;

import java.util.Scanner;

public class TempConverterTest {
    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter degrees Celsius: ");
        double degreeCelsius = sc.nextDouble();

        double resultInF = tempConverter.converterFromCtoF(degreeCelsius);
        double resultInK = tempConverter.converterFromCtoK(degreeCelsius);

        System.out.println("Temperature in Fahrenheit: " + resultInF);
        System.out.println("Temperature in Kelvin: " + resultInK);

        sc.close();
    }
}
