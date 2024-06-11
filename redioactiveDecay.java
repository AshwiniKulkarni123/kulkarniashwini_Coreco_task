package corecoTask.com;

public class redioactiveDecay {

    public static void main(String[] args)
    {
        double initialMass = 200;
        double halfLifeYears = 8;
        int numberOfHalfLives = 5;

        double remainingMass = initialMass * Math.pow(0.5, numberOfHalfLives);
        double yearsToDecay = halfLifeYears * numberOfHalfLives;

        System.out.println("Remaining mass: " + remainingMass + " units");
        System.out.println("Years to decay: " + yearsToDecay + " years");
    }
}
/****************OUTPUT***********
 Remaining mass: 6.25 units
Years to decay: 40.0 years
*********************************/