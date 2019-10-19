package vining_p2;

public class Application {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        double monthlyInterestSaver1;
        double balanceSaver1 = 2000.0;
        double monthlyInterestSaver2;
        double balanceSaver2 = 3000.0;

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("");
        System.out.println("Monthly Interest Rate: 4%");
        System.out.println("");

        for (int i = 1; i <=12; i++)
        {
            System.out.println("Month: " + i);
            saver1.setSavingsBalance(balanceSaver1);
            balanceSaver1  += saver1.calculateMonthlyInterest();
            System.out.printf("Saver 1 balance: $%.2f\n", balanceSaver1);
            saver2.setSavingsBalance(balanceSaver2);
            balanceSaver2  += saver2.calculateMonthlyInterest();
            System.out.printf("Saver 2 balance: $%.2f\n\n", balanceSaver2);
        }

        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("");
        System.out.println("Monthly Interest Rate: 5%");
        System.out.println("");

        for (int i = 1; i <=12; i++)
        {
            System.out.println("Month: " + i);
            saver1.setSavingsBalance(balanceSaver1);
            balanceSaver1  += saver1.calculateMonthlyInterest();
            System.out.printf("Saver 1 balance: $%.2f\n", balanceSaver1);
            saver2.setSavingsBalance(balanceSaver2);
            balanceSaver2  += saver2.calculateMonthlyInterest();
            System.out.printf("Saver 2 balance: $%.2f\n\n", balanceSaver2);
        }

    }
}
