package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Roxana
 */
public class Phonebook {
    public static void main(String[] args) {
        String phonebookFilePath = "phonebook.txt";
        String searchName1 = "Abbey";
        String searchName2 = "Abdul";

        try (BufferedReader reader = new BufferedReader(new FileReader(phonebookFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] entry = line.split(" ");
                if (entry.length >= 2) {
                    String name = entry[0];
                    String phoneNumber = entry[1];

                    if (name.equals(searchName1) || name.equals(searchName2)) {
                        System.out.println(name + " " + phoneNumber);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
