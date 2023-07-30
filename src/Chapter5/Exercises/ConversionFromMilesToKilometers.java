package Chapter5.Exercises;
//5.4 (Conversion from miles to kilometers) Write a program that displays the following table (note 1 mile is 1.609 kilometers)
public class ConversionFromMilesToKilometers {
    public static void main(String[] args) {

        int miles = 1;

        System.out.println("Kilograms   Kilometers");
        //Con loop While
        while (miles < 11) {
            double kilometers = miles * 1.609;
            System.out.printf("%-5d       %.1f%n", miles, kilometers);
            miles++;
        }
        System.out.println("Kilograms   Kilometers");
        //Con loop for
        for (miles = 1; miles < 11 ;miles++){
            double kilometers = miles * 1.609;
            System.out.printf("%-5d       %.1f%n", miles, kilometers);
        }
    }
}
