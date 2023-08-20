public class LoopStatements {

    public static void main(String[] args) {
        int number = 1234;
        int sum = sumOddDigits(number);
        System.out.println("Sum of odd digits: " + sum);

        number = 246;
        sum = sumOddDigits(number);
        System.out.println("Sum of odd digits: " + sum);
    }

    public static int sumOddDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

}

