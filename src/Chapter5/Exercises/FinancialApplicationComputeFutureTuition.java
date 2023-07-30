package Chapter5.Exercises;
//PENDIENTE
//5.7 (Financial application: compute future tuition) Suppose the tuition for a university is $10,000
// this year and increases 5% every year. In one year, the tuition will
//be $10,500. Write a program that displays the tuition in 10 years, and the total
//cost of four years’ worth of tuition starting after the tenth year.
public class FinancialApplicationComputeFutureTuition {
    public static void main(String[] args) {
        int year = 0;
        double tuition = 10000.00;
        double total = 0;

        while (year < 11){
            tuition = tuition * 1.05;
            if (year == 10){
                int countAfterTenYears = 1;
                while (countAfterTenYears < 5){
                    tuition = tuition * 1.05;
                    total = tuition;
                    countAfterTenYears++;
                }
            }
            year++;
        }
        System.out.println("The tuition after 10 years will be: " + tuition);
        System.out.println("TOTAL " + total);
    }
}
