package Chapter5.Exercises;
//*5.39 (Financial application: find the sales amount) You have just started a sales job
//in a department store. Your pay consists of a base salary and a commission. The
//base salary is $5,000. The scheme shown below is used to determine the commission rate.
//Sales Amount Commission Rate
//$0.01–$5,000 8%
//$5,000.01–$10,000 10%
//$10,000.01 and above 12%
//Note this is a graduated rate. The rate for the first $5,000 is at 8%, the next
//$5,000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission is 5,000 * 8 + 5,000 * 10 + 15,000 * 12 = 2,700
//Your goal is to earn $30,000 a year. Write a program that finds out the minimum number of sales you have to generate in order to make $30,000
public class FinancialApplicationFindTheSalesAmount {
    public static void main(String[] args) {
        double baseSalary = 5000;

        double commissionRate1 = 8.00;
        double commissionRate2 = 10.00;
        double commissionRate3 = 12.00;

        double commission = baseSalary * commissionRate1 + baseSalary * commissionRate2 + 15000 * commissionRate3;
        double totalSalary = baseSalary + commission;

        System.out.println(commission);





    }
}
