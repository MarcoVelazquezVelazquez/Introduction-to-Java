package Chapter5.Exercises;
//5.3 (Conversion from kilograms to pounds) Write a program that displays the following table (note 1 kilogram is 2.2 pounds):
//Kilograms Pounds
//1   2.2
//3   6.6
//. . .
//197 433.4
//199 437.8
public class ConversionFromKilogramsToPounds {
    public static void main(String[] args) {

        int kilograms = 1;

        System.out.println("Kilograms   Pounds");

        while (kilograms < 200){
            double pounds = kilograms * 2.2;
            System.out.printf("%-5d       %.1f%n", kilograms, pounds);
            kilograms++;
        }
    }
}
