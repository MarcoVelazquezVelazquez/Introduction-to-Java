package Chapter9.Exercises;

import java.util.Date;

//9.7 (The Account class) Design a class named Account that contains:
//■ A private int data field named id for the account (default 0).
//■ A private double data field named balance for the account (default 0).
//A private double data field named annualInterestRate that stores the current
//interest rate (default 0). Assume that all accounts have the same interest rate.
//■ A private Date data field named dateCreated that stores the date when the
//account was created.
//■ A no-arg constructor that creates a default account.
//■ A constructor that creates an account with the specified id and initial balance.
//■ The accessor and mutator methods for id, balance, and annualInterestRate.
//■ The accessor method for dateCreated.
//■ A method named getMonthlyInterestRate() that returns the monthly
//interest rate.
//■ A method named getMonthlyInterest() that returns the monthly interest.
//■ A method named withdraw that withdraws a specified amount from the
//account.
//■ A method named deposit that deposits a specified amount to the account.
// Draw the UML diagram for the class then implement the class. (Hint: The method
//getMonthlyInterest() is to return monthly interest, not the interest rate.
//Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is
// annualInterestRate / 12. Note annualInterestRate is a percentage, for example 4.5%.
// You need to divide it by 100.)
// Write a test program that creates an Account object with an account ID of 1122,
//a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
//method to withdraw $2,500, use the deposit method to deposit $3,000, and print
//the balance, the monthly interest, and the date when this account was created.
public class Account {

    private int id;

    private static double balance;

    private double annualInterestRate;

    Date dateCreated = new Date();

    public Account() {
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
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

    public double withdraw(double amount){
        balance = balance - amount;
        return balance;
    }

    public double deposit(double depositedAmount){
        balance = balance + depositedAmount;
        return balance;

    }

    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        account.setAnnualInterestRate(4.5);
        System.out.println("Withdraw: " + account.withdraw(2500) );
        System.out.println("Deposit: " + account.deposit(3000));
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Annual Interest Rate: " + account.getMonthlyInterest());
        System.out.println("Date created: " + account.getDateCreated());
    }
}
