package Chapter5.Exercises;
//5.6 (Conversion from miles to kilometers) Write a program that displays the following two tables side by side:
//Miles Kilometers | Kilometers Miles
//1 1.609 | 20 12.430
//2 3.218 | 25 15.538
//. . .
//9 14.481 | 60 37.290
//10 16.090 | 65 40.398
public class ConversionFromMilesToKilometersAndKilometersToMiles {

/*    public static void main(String[] args) {

        System.out.println("Miles     Kilometers   |  Kilometers     Miles");

        for (int miles = 1; miles < 11; miles++){
            double kilometers = miles * 1.609;
            System.out.println(miles + "     |     " + kilometers);
        }

        for (int kilometers = 1; kilometers < 70; kilometers = kilometers + 5){
            double miles = kilometers / 1.609;
            System.out.println(kilometers + "     |     " + miles);
        }
    }
}*/

//SOLUCIÓN DEL LIBRO
    public static void main(String[] args) {
        System.out.printf("%10s%10s    |  %10s%10s\n", "Miles", "Kilometers",
                "Kilometers", "Miles");
        System.out.println("---------------------------------------------");

        // Use while loop
        int miles = 1;
        int kilometers = 20;
        int count = 1;
        while (count <= 10) {
            System.out.printf("%10d%10.3f    |  %10d%10.3f\n", miles, miles * 1.609,
                    kilometers, kilometers / 1.609);
            miles++;
            kilometers += 5;
            count++;
        }

        /*
         * Use for loop int miles = 1; int kilometers = 20; for (int count = 1;
         * count <= 10; miles++, kilometers += 5, count++) {
         * System.out.printf("%10d%10.3f    |  %10d%10.3f\n", miles, miles * 1.609,
         * kilometers, kilometers / 1.609); }
         */
    }
}
