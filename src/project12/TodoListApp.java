package project12;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoListApp {
    public static void main(String[] args) {
        Path path = Path.of("todo.txt");
        List<String> tasks = new ArrayList<>();

        if (Files.exists(path)) {
            try {
                tasks = new ArrayList<>(Files.readAllLines(path, StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1 - Show all tasks");
            System.out.println("2 - Add a new task");
            System.out.println("3 - Save and exit");
            System.out.print("Choose option: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet.");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (choice.equals("2")) {
                System.out.print("Enter new task description: ");
                String task = scanner.nextLine().trim();
                tasks.add(task);
            } else if (choice.equals("3")) {
                try {
                    Files.write(path, tasks, StandardCharsets.UTF_8);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                running = false;
            } else {
                System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }
}