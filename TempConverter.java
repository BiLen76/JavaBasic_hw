package Homeworks;

public class TempConverter {

    public double converterFromCtoF(double tempC) {

        double tempInF = tempC * 1.8 + 32;
        return tempInF;
    }

    public double converterFromCtoK(double tempC) {

        double tempInK = tempC + 273.15;
        return tempInK;
    }

}

