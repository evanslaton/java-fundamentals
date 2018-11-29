import java.util.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) {
//        int[][] weeklyMonthTemperatures = {
//                {66, 64, 58, 65, 71, 57, 60},
//                {57, 65, 65, 70, 72, 65, 51},
//                {55, 54, 60, 53, 59, 57, 61},
//                {65, 56, 55, 52, 55, 62, 57}
//        };
//
//        printMaxMinAbsentValues(weeklyMonthTemperatures);
//        System.out.println(findMaximumValue(getUniqueValues(weeklyMonthTemperatures)));
//        System.out.println(findMinimumValue(getUniqueValues(weeklyMonthTemperatures)));

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

//        String winner = tally(votes);
        System.out.println(votes.size());

    }

    // Prints the maximum, minimum and absent values between the minimum and maximum from a HashSet
    public static void printMaxMinAbsentValues(int[][] twoDimensionalArray) {
        HashSet<Integer> uniqueIntegers = getUniqueValues(twoDimensionalArray);
        int maximumValue = findMaximumValue(uniqueIntegers);
        int minimumValue = findMinimumValue(uniqueIntegers);

        System.out.println("Low: " + maximumValue);
        System.out.println("High: " + minimumValue);

        for (int i = minimumValue; i <= maximumValue; i++) {
            if (!uniqueIntegers.contains(i)) {
                System.out.println("Never saw temperature: " + i);
            }
        }
    }

    // Returns all unique Integers from a 2d array in a HashSet
    public static HashSet<Integer> getUniqueValues(int[][] twoDimensionalArray) {
        HashSet<Integer> uniqueIntegers = new HashSet();
        for (int[] arrayOfInts : twoDimensionalArray) {
            for (int value: arrayOfInts) {
                if (!uniqueIntegers.contains(value)) {
                    uniqueIntegers.add(value);
                }
            }
        }
        return uniqueIntegers;
    }

    // Returns the maximum value in a HashSet
    public static int findMinimumValue(HashSet<Integer> uniqueIntegers) {
        return Collections.min(uniqueIntegers);
    }

    // Returns the maximum value in a HashSet
    public static int findMaximumValue(HashSet<Integer> uniqueIntegers) {
        return Collections.max(uniqueIntegers);
    }

    public static String tally(List<String> votes) {
        HashMap<String, Integer> candidatesAndVoteTally =  new HashMap<>();

        for (String candidate : votes) {

        }

        return "placeholder";
    }
}
