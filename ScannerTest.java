package Homeworks;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pls what is your year of birth: ");
        int year = sc.nextInt();
        System.out.println("You selected year is " + year);

        int year1 = 1976;

        System.out.println(1976 / 3);  // 658
        System.out.println(1976 % 3);    // 2

        System.out.println(658 / 3);   // 219
        System.out.println(658 % 3);     // 1

        System.out.println(219 / 3);   // 73
        System.out.println(219 % 3);     // 0

        System.out.println(73 / 3);   // 24
        System.out.println(73 % 3);     // 1

        System.out.println(24 / 3);   // 8
        System.out.println(24 % 3);     // 0

        System.out.println(8 / 3);   // 2
        System.out.println(8 % 3);     // 2

        System.out.println(2 / 3);   // 0
        System.out.println(2 % 3);     // 2

        System.out.println(2 * Math.pow(3, 6) + 2 * Math.pow(3, 5) + 0 * Math.pow(3, 4) + 1 * Math.pow(3, 3) + 0 * Math.pow(3, 2) + 1 * Math.pow(3, 1) + 2 * Math.pow(3, 0));

        int result = 2201012;
        System.out.println("The Ternary Value: " + result);

        sc.close();

    }
}
