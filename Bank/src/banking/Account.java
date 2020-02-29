package banking;

import org.junit.Test;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    @Test
    public void withdraw(double amount){
        if (this.balance<amount){
            System.out.printf ("DO NOT HAVE ENOUGH BALANCE!!!");
            return;
        }else   {
        this.balance-=amount;
        }
    }
    public void deposit(double amount){
        if (this.balance<0){
            System.out.println ("Invalid Amount!!!");
            return;
        }else{
        this.balance+=amount;
        }
    }




















    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
