package project12;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TextFileStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String inputPath = scanner.nextLine();

        Path path = Path.of(inputPath);
        int totalLines = 0;
        int nonEmptyLines = 0;
        int totalCharacters = 0;

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalLines++;
                if (!line.trim().isEmpty()) {
                    nonEmptyLines++;
                }
                totalCharacters += line.length();
            }

            System.out.println("Total lines: " + totalLines);
            System.out.println("Non-empty lines: " + nonEmptyLines);
            System.out.println("Total characters: " + totalCharacters);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }
}