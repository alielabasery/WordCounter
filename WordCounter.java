import java.util.*;
import java.math.*;

public class Solution {
    public static int solution(String S, String targetWord) {
        if (S == null || S.length() == 0 || targetWord == null || targetWord.length() == 0) {
            return 0; // Return 0 for empty or null strings
        }

        S = S.toLowerCase(); // Convert original string to lowercase
        targetWord = targetWord.toLowerCase(); // Convert target word to lowercase

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char ch : S.toCharArray()) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        int maxMoves = Integer.MAX_VALUE;

        for (char ch : targetWord.toCharArray()) {
            if (!charCounts.containsKey(ch) || charCounts.get(ch) == 0) {
                return 0; // Return 0 for characters not present or exhausted in the original string
            }
            charCounts.put(ch, charCounts.get(ch) - 1);
            maxMoves = Math.min(maxMoves, charCounts.get(ch));
        }

        return maxMoves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string S: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the target word: ");
        String targetWord = scanner.nextLine();

        int result = solution(inputString, targetWord);
        System.out.println("Maximum number of moves: " + result);
    }
}
