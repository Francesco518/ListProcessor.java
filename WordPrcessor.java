import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordPrcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the number of elements (N): ");
        int N = scanner.nextInt();

        Set<String> wordsSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();

        System.out.println("Enter " + N + " words:");

        for (int i = 0; i < N; i++) {
            String word = scanner.next();

            if (!wordsSet.add(word)) {
                duplicateSet.add(word);
            }
        }
        System.out.println("\nDuplicate words:");
        duplicateSet.forEach(System.out::println);

        System.out.println("\nNumber of distinct words: " + wordsSet.size());

        System.out.println("\nDistinct words:");
        wordsSet.forEach(System.out::println);
    }
}
