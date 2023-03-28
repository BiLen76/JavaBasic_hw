package Homeworks;

public class WorkTime {
    public static void main(String[] args) {

        int secondsboard = (int) (Math.random() * 28800);
        int hoursboard = (secondsboard / 60) / 60;

        System.out.println("Left to work " + secondsboard + " seconds");
        System.out.println("Left to work " + hoursboard + " hour");
    }
}

