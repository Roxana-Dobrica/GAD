package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Occurrence {
    public static void main(String[] args) {
        String inputFile = "Desktop/occurrence.txt";
        int topCount = 10;

        try {
            File file = new File(inputFile);
            Scanner scanner = new Scanner(file);

            Map<String, Integer> wordCounts = new HashMap<>();

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                word = word.replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }

            scanner.close();

            List<Map.Entry<String, Integer>> sortedWordCounts = new ArrayList<>(wordCounts.entrySet());
            sortedWordCounts.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedWordCounts) {
                if (count >= topCount) {
                    break;
                }

                String word = entry.getKey();
                int wordCount = entry.getValue();

                System.out.println(word + " - " + wordCount);

                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
