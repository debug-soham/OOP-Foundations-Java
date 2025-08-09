/*
Q1. Implement a Java class to represent a bank account with methods to deposit, withdraw and check the balance.
*/

public class BankAccount
{
    double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public static void main(String args[])
    {
        BankAccount account = new BankAccount(10000);

        account.deposit(2400);
        account.withdraw(4640);
        System.out.println("Current Balance: " + account.getBalance());
    }

}
