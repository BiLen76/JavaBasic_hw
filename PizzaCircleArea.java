package Homeworks;

import java.util.Scanner;

public class PizzaCircleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Pls enter Pizza diameter: ");

        double diameter = sc.nextDouble();

        double area = Math.PI * (diameter * diameter / 4);
        System.out.println("Pizza area: " + area);

        sc.close();
    }
}
