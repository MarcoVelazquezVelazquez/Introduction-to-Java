package Chapter1.Exercises;

//NO COMPLETADO
//Exercise 1.9 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
//minutes, and 35 seconds. Write a program that displays the average speed in
//kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
public class AverageSpeedInKilometers {
    public static void main(String[] args) {

        double milesPerHour = 24/100.35;
        double milesToKm = 24 * 1.6;

        double KmPerHour = milesToKm / 100.35;

        System.out.println(KmPerHour);

        //Solución del libro

        System.out.println(24 / (1 + (40 + 35.0 / 60) / 60) * 1.6);
    }

}
