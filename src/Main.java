import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Завдання 1: Видалення дублікатів із збереженням порядку
        System.out.println("Завдання 1: Видалення дублікатів");
        System.out.print("Введіть максимальну кількість завдань: ");
        int maxTasks = scanner.nextInt();
        scanner.nextLine();

        LinkedHashSet<String> uniqueTasks = new LinkedHashSet<>();
        System.out.println("Введіть завдання:");

        for (int i = 0; i < maxTasks; i++) {
            String task = scanner.nextLine();
            uniqueTasks.add(task);  // Додасть лише унікальні завдання
        }

        System.out.println("Завдання без дублікатів: " + uniqueTasks);

        // Завдання 2: Підрахунок повторів букв
        System.out.println("Завдання 2: Підрахунок повторів букв");
        System.out.print("Введіть слово: ");
        String word = scanner.nextLine();

        Map<Character, Integer> letterCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }
        System.out.println("Кількість повторів букв: " + letterCount);
    }
}
