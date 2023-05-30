package Concurrency2;


public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Account 1", 1000);
        BankAccount account2 = new BankAccount("Account 2", 2000);

        TransactionThread thread1 = new TransactionThread("Thread 1", account1, account2, 500);
        TransactionThread thread2 = new TransactionThread("Thread 2", account2, account1, 300);

        thread1.start();
        thread2.start();
    }
    
}
