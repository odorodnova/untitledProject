package lessons6_7_8;

public class CreditCard {
    private final String accountNumber;
    private double currentBalance;

    public CreditCard(String accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public void deposit(double amount) {
        currentBalance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= currentBalance) {
            currentBalance -= amount;
        } else {
            System.out.println("Insufficient funds. You ran out of money, dude.");
        }
    }

    public void printCardInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + currentBalance);
    }
}

class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("4815162342", 666.0);
        CreditCard card2 = new CreditCard("2432615184", 1313.0);
        CreditCard card3 = new CreditCard("8866614886", 4815.0);

        card1.deposit(334.0);
        card2.deposit(687.0);
        card3.withdraw(815.0);

        card1.printCardInfo();
        card2.printCardInfo();
        card3.printCardInfo();
    }
}
