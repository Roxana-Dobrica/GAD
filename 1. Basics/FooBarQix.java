public class FooBarQix {
    public String compute(int number){
        String stringNum = null;
        if(number % 3 == 0){
            stringNum = "Foo";
        }
        if(number % 5 == 0){
            stringNum = stringNum + "Bar";
        }
        if(number % 7 == 0){
            stringNum = stringNum + "Qix";
        }

    }

    public static void main(String[] args) {

    }
}
