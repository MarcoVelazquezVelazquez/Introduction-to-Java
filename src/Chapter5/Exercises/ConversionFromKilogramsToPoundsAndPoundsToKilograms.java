package Chapter5.Exercises;
//5.5 Write a program that displays the following two tables side by side:
public class ConversionFromKilogramsToPoundsAndPoundsToKilograms {
    public static void main(String[] args) {

        int kilograms = 1;

        System.out.println("Kilograms     Pounds");
        while (kilograms < 200) {
            double pounds = kilograms * 2.22;
            System.out.printf("%-5d       %.1f%n", kilograms, pounds);
            kilograms++;
        }

        int pounds = 20;
        System.out.println("Pounds     Kilograms");

        while (pounds < 520){
            double kgs = pounds / 2.22;
            System.out.printf("%-5d       %.1f%n", pounds, kgs);
            pounds = pounds + 5;
        }
    }
}
