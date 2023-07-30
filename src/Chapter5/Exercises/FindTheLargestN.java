package Chapter5.Exercises;
//5.13 (Find the largest n such that n3 < 12,000) Use a while loop to find the largest
//integer n such that n3
// is less than 12,000.
public class FindTheLargestN {
    public static void main(String[] args) {
        int n = 1;
        while ((n * n * n) < 12000){
            n++;
        }
        n--;
        System.out.println("The largest n such that n3 < 12,000 is: " + n);
    }
}
