package Chapter1.Exercises;
//Exercise 1.10 (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
//and 30 seconds. Write a program that displays the average speed in miles per
//hour. (Note 1 mile is equal to 1.6 kilometers.)
public class AverageSpeedInMiles {
    public static void main(String[] args) {

        double km = 14;
        double miles = km / 1.6;
        double time = miles/45.5;
        double MilesPerHour = (miles * 60) / (45.5);

        System.out.println(miles);
        System.out.println(time);
        System.out.println(MilesPerHour);

        // Solución del libro
        System.out.println((14 / 45.5) * 60 / 1.6);

    }
}
