package Chapter5.Exercises;
//5.12 Find the smallest n such that n2 > 12,000
public class FindTheSmallestNSuchThatN2 {
    public static void main(String[] args) {
        int n = 1;
        while ((n * n) <= 12000){
            n++;
        }
        System.out.println("The smallest n such that n2 > 12,000 is: " + n);
    }
}
