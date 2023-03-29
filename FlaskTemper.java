package Homeworks;

import java.util.Scanner;

public class FlaskTemper {
    public static void main(String[] args) {

        int Temperature1;
        int Temperature2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter the temperature 1: ");
        int Temp1 = scanner.nextInt();

        System.out.println("Pls enter the temperature 2: ");
        int Temp2 = scanner.nextInt();

        scanner.close();

        if (Temp1 > 100 && Temp2 < 100) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
