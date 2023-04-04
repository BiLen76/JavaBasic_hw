package Homeworks;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many floors are in your building? ");
        int buildingHeight = scanner.nextInt();

        System.out.println("How many floors does the lift go up? ");
        int goUp = scanner.nextInt();

        System.out.println("How many floors does the lift go down? ");
        int goDown = scanner.nextInt();

        scanner.close();

        int elevatorFloor = 0;

        if (goDown > goUp) {
            System.out.println("Elevator can't move up");
            elevatorFloor = 0;

        } else {
            if (buildingHeight <= goUp) {

                System.out.println("The elevator went up to the top floor");
                elevatorFloor = 1;
            } else {
                elevatorFloor = buildingHeight / (goUp - goDown);
            }
        }
        System.out.println("If you need to go up on the " + buildingHeight + " floor, you have to do " + elevatorFloor + " climbs");
    }
}

