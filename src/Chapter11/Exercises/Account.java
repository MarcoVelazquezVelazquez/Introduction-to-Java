package Chapter11.Exercises;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    //new
    private String name;

    public String getName() {
        return name;
    }

    ArrayList<Transaction> transactions = new ArrayList<>();


    public Account(String name, int id, double annualInterestRate, Date dateCreated) {
        this.name = name;
        this.id = id;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    private int id;

    private static double balance;

    private double annualInterestRate;

    Date dateCreated = new Date();

    public Account() {
    }

    //new
    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.setBalance(balance);
    }



    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    //new
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){

        return balance * (annualInterestRate / 12);
    }

    public void withdraw(double amount){
        balance = balance - amount;
        transactions.add(new Transaction('W', amount, balance, ""));
    }

    public void deposit(double depositedAmount){
        balance = balance + depositedAmount;
        transactions.add(new Transaction('D', depositedAmount, balance, ""));

    }

    public static void main(String[] args) {
        Chapter9.Exercises.Account account = new Chapter9.Exercises.Account(1122, 20_000);
        account.setAnnualInterestRate(4.5);
        System.out.println("Withdraw: " + account.withdraw(2500) );
        System.out.println("Deposit: " + account.deposit(3000));
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Annual Interest Rate: " + account.getMonthlyInterest());
        System.out.println("Date created: " + account.getDateCreated());

        //Chapter 11 exercise
        System.out.println("new Account");

        Account acc11 = new Account("George",1222,1000);
        acc11.setAnnualInterestRate(1.5);
        acc11.deposit(30);
        acc11.deposit(40);
        acc11.deposit(50);

        acc11.withdraw(5);
        acc11.withdraw(4);
        acc11.withdraw(2);

        System.out.println(acc11.getName() + "  " + acc11.getAnnualInterestRate() + "  " + acc11.getBalance());

        ArrayList<Transaction> list = acc11.getTransactions();

        System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");

        for (int i = 0; i < list.size(); i++) {
            Transaction transaction = list.get(i);
            System.out.printf("%-35s%-15s%-15s%-15s\n", transaction.getDate(),
                    transaction.getType(), transaction.getAmount(), transaction.getBalance());
        }


    }
}
