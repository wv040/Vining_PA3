package vining_p2;

public class SavingsAccount {

    private static double annualInterestRate = 0.04;

    private static double savingsBalance;

    public double getSavingsBalance()
    {
        return savingsBalance;
    }

    public void setSavingsBalance(double balance)
    {
        savingsBalance = balance;
    }

    public static double calculateMonthlyInterest ()
    {
        double monthlyInterest;

        monthlyInterest = (savingsBalance * annualInterestRate) / 12;

        return monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
}
