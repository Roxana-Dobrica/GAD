package Generics.pairs;

public class Main {

    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);

        //Running runningShoe1 = new Running("RED", 41);
        //Boot bootShoe = new Boot("BLACK", 45);
        //Pair<Running> pairKO = new Pair<>(runningShoe1, bootShoe);
    }
}
