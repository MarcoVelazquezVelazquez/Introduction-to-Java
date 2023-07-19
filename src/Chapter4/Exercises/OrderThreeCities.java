package Chapter4.Exercises;

import java.util.Scanner;

//4.24 (Order three cities) Write a program that prompts the user to enter three cities
//and displays them in ascending order. Here is a sample run:
public class OrderThreeCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String firstCity = input.nextLine();
        System.out.println("Enter the second city: ");
        String secondCity = input.nextLine();
        System.out.println("Enter the third city: ");
        String thirdCity = input.nextLine();


        //A continuación, se utilizan varias instrucciones if
        // y compareTo para ordenar los nombres de las ciudades en orden alfabético.

        //La primera instrucción if compara s1 con s2 utilizando el método compareTo. Si el resultado es mayor que 0,
        // significa que s1 es mayor que s2 en orden alfabético. En ese caso, se intercambian los valores de s1 y s2
        // utilizando una variable temporal temp.

        if (firstCity.compareTo(secondCity) > 0){
            //Swap fC with sC
            String temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }

        //La segunda instrucción if compara s2 con s3. Si el resultado es mayor que 0, se
        // intercambian los valores de s2 y s3 utilizando una variable temporal temp.

        if (secondCity.compareTo(thirdCity) > 0){
            //Swap sC with tC
            String temp = secondCity;
            secondCity = thirdCity;
            thirdCity = temp;
        }

        //La tercera instrucción if se repite para asegurarse de que s1 esté en el lugar
        // correcto en caso de que sea mayor que s2 después de las primeras dos comparaciones.
        // Se intercambian los valores de s1 y s2 si es necesario.

        if (firstCity.compareTo(secondCity) > 0){
            //Swap fC with sC
            String temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }

        System.out.println("The three cities in alphabetical order are " + firstCity + " " + secondCity + " " + thirdCity);

    }
}

//

