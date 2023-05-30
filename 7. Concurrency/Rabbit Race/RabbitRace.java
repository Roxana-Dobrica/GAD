package Concurrency;


public class RabbitRace {
    public static void main(String[] args) {
        int numberOfRabbits = 5;

        Thread[] threads = new Thread[numberOfRabbits];
        for (int i = 0; i < numberOfRabbits; i++) {
            threads[i] = new RabbitThread(i + 1);
        }

        Runnable[] runnables = new Runnable[numberOfRabbits];
        for (int i = 0; i < numberOfRabbits; i++) {
            runnables[i] = new RabbitRunnable(i + 1);
        }

        for (int i = 0; i < numberOfRabbits; i++) {
            if (i % 2 == 0) {
                threads[i].start();
            } else {
                new Thread(runnables[i]).start();
            }
        }

        for (int i = 0; i < numberOfRabbits; i++) {
            if (i % 2 == 0) {
                threads[i].run();
            } else {
                runnables[i].run();
            }
        }
    }
}
