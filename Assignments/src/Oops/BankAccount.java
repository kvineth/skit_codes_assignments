package Oops;
import java.util.Scanner;

public class BankAccount 
{
	public static void main(String[] args) 
    {
        BankAccount myAccount = new BankAccount("123456789", 500.00);

        System.out.println("Initial Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + myAccount.getBalance());


        myAccount.setBalance(750.50);

        System.out.println("Updated Balance: $" + myAccount.getBalance());

    }
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) 
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() 
    {
        return accountNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    
}
