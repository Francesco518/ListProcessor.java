import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListProcessor {
    public static List<Integer> generateRandomList(int N) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            randomList.add(random.nextInt(101));
        }
        Collections.sort(randomList);
        return randomList;
    }
    public static List<Integer> reverseAndConcat(List<Integer> originalList) {
        List<Integer> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);

        List<Integer> concatenatedList = new ArrayList<>(originalList);
        concatenatedList.addAll(reversedList);

        return concatenatedList;
    }
    public static void printValuesByPosition(List<Integer> list, boolean printEvenPositions) {
        System.out.println("Values at " + (printEvenPositions ? "even" : "odd") + " positions:");

        for (int i = printEvenPositions ? 1 : 0; i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        int N = 5;

        List<Integer> randomList = generateRandomList(N);
        System.out.println("Generated Sorted List: " +randomList);

        List<Integer> reversedAndConcatenatedList = reverseAndConcat(randomList);
        System.out.println("Reversed and Concatenated List: " + reversedAndConcatenatedList);

        boolean printEvenPositions = true;
        printValuesByPosition(reversedAndConcatenatedList, printEvenPositions);
    }
}
