package Chapter11.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
       /* numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);*/

        System.out.println("Enter ten numbers; ");

       /* int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        int n6 = input.nextInt();
        int n7 = input.nextInt();
        int n8 = input.nextInt();
        int n9 = input.nextInt();
        int n10 = input.nextInt();

        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);
        numbers.add(n6);
        numbers.add(n7);
        numbers.add(n8);
        numbers.add(n9);
        numbers.add(n10);
*/

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            numbers.add(num);
        }

        System.out.println("ArrayList: " + numbers);

        //sum(numbers);
        removeDuplicate(numbers);

        System.out.println("Removed duplicates " + numbers);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {

       /* for (int i = 0; i < list.size(); i++){
            if (list.contains(list.get(i))){
                list.remove(list.get(i));
            }; // Add the value if it is not in the list

        }*/

        // Creamos una nueva ArrayList llamada distinctList para almacenar los valores distintos.
        ArrayList<Integer> distinctList = new ArrayList<>();

        // Iteramos a través de cada elemento en la lista original.
        for (Integer num : list) {
            // Verificamos si distinctList ya contiene el elemento actual.
            // Si no lo contiene, lo agregamos a distinctList.
            if (!distinctList.contains(num)) {
                distinctList.add(num);
            }
        }

        // Luego, limpiamos la lista original (list) y agregamos los elementos únicos de distinctList.
        list.clear();
        list.addAll(distinctList);
    }

}

