package Chapter4.Exercises;
//4.25 (Generate vehicle plate numbers) Assume that a vehicle plate number consists
//of three uppercase letters followed by four digits. Write a program to generate a
//plate number.
public class GenerateVehiclePlateNumbers {
    public static void main(String[] args) {

        //Generar un caracter aleatorio
        char ch1 = (char) (Math.random() * 26 + 'A');
        char ch2 = (char) (Math.random() * 26 + 'A');
        char ch3 = (char) (Math.random() * 26 + 'A');
        //Generar un número aleatorio de 4 digitos
        int fourDigitsRandomNumber = (int) (Math.random() * 9000) + 1000;

        System.out.println("The vehivle plate number is: " + Character.toUpperCase(ch1) + "" + Character.toUpperCase(ch2)
                + "" + Character.toUpperCase(ch3) + "" + fourDigitsRandomNumber);

    }
}
