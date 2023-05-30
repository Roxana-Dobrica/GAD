package Reactive;

import java.util.Arrays;
import java.util.List;

public class OperationsInReactor {
    private static List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );

    static void displayingLetters() {
        int count = 1;
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                System.out.println(count + ". " + letter);
                count++;
            }
        }
    }

    static void findingMissingLetter() {
        int count = 1;
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                System.out.println(count + ". " + letter);
                count++;
            }
        }
    }

    static void restoringMissingLetter() {
        int count = 1;
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                System.out.println(count + ". " + letter);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        displayingLetters();
    }
    
}
