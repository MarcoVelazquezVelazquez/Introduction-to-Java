package Chapter10.Exercises;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger){
        return myInteger.isPrime();
    }

    public boolean equals(int otherValue) {
        return value == otherValue;
    }

    public boolean equals(MyInteger other) {
        return value == other.getValue();
    }

    public static int parseInt(char[] charArray) {
        int result = 0;
        for (char c : charArray) {
            if (c >= '0' && c <= '9') {
                result = result * 10 + (c - '0');
            } else {
                throw new NumberFormatException("Invalid character in char array");
            }
        }
        return result;
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {

        MyInteger mi = new MyInteger(5);
        System.out.println("Methods " + mi.isPrime());
    }


}
