package Chapter5.Exercises;
//5.10 (Find numbers divisible by 5 and 6) Write a program that displays all the numbers from
// 100 to 1,000 (10 per line) that are divisible by 5 and 6. Numbers are
//separated by exactly one space.
public class FindNumbersDivisibleBy5And6 {
    public static void main(String[] args) {

        int count = 1;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
               /* if (count++ % 10 != 0) {
                    System.out.println(i + " ");
                }
                else {
                    System.out.println(i + "\n");
                }*/
                System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");
            }
        }
    }

}
