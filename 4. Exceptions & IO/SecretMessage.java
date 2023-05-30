package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class SecretMessage {
    
public static void main(String[] args) {
        String messageUrl = "https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/message.txt";

        try {
            URL url = new URL(messageUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            StringBuilder messageBuilder = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                String filteredLine = line.replaceAll("[^A-ZX]", "");
                filteredLine = filteredLine.replace('X', ' ');

                // Append to the message
                messageBuilder.append(filteredLine);
            }

            reader.close();

            String secretMessage = messageBuilder.toString();

            System.out.println("Input: " + secretMessage);
            System.out.println("Output: " + secretMessage.trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
