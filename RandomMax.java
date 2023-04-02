package Homeworks;

public class RandomMax {
    public static void main(String[] args) {

        // Создать программу, выводящую на экран случайно сгенерированное трёхзначное целое число и его наибольшую цифру

        int naturalnumber = (int) (Math.random()*899+100);
        int firstnumber = naturalnumber/100;
        int secondnumber = (naturalnumber%100)/10;
        int thirdnumber = naturalnumber%10;

        if(firstnumber>=secondnumber&&firstnumber>=thirdnumber) {
            System.out.println("In the number "+naturalnumber+" max digit " + firstnumber);

        } else if(secondnumber>=firstnumber&&secondnumber>=thirdnumber) {
            System.out.println("In the number "+naturalnumber+" max digit " + secondnumber);
        } else {
            System.out.println("In the number "+naturalnumber+" max digit " + thirdnumber);
        }
    }
}
