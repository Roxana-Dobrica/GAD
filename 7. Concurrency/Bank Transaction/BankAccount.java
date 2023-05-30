package Concurrency2;


public class BankAccount {
    private String name;
    private int debit;

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    public void withdraw(double amount) {
        longDatabaseCall();
        debit -= amount;
        System.out.println(name + " withdrew $" + amount);
    }

    public void deposit(double amount) {
        longDatabaseCall();
        debit += amount;
        System.out.println(name + " deposited $" + amount);
    }

    private void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getDebit() {
        return debit;
    }
}
