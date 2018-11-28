/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int n) {
        int[] rolls = new int[n];
        for (int i = 0; i < n; i++) {
            rolls[i] = randomNumberGenerator();
        }
        return rolls;
    }

    public static int randomNumberGenerator() {
        return (int) Math.ceil(Math.random() * 6);
    }

    public static boolean containsDuplicates(int[] toCheckForDuplicates) {
        int counter = 0;
        for (int number : toCheckForDuplicates) {
            counter = 0;
            for (int i = 0; i < toCheckForDuplicates.length; i++) {
                if (number == toCheckForDuplicates[i]) { counter++; }
            }
            if (counter > 1) { return true; }
        }
        return false;
    }

    public static int calculateAverage(int[] getAverageOf) {
        double average = 0;
        for (int number : getAverageOf) { average += number; }
        return (int) Math.round(average) / getAverageOf.length;
    }

    public static int[] lowestAverage(int[][] getLowestAverageOf) {
        int arrayLength = getLowestAverageOf[0].length;
        int[] hasLowestAverage = new int[arrayLength];
        int lowestAverage = calculateAverage(getLowestAverageOf[0]);
        int currentAverage = 0;

        for (int[] array : getLowestAverageOf) {
            currentAverage = calculateAverage(array);
            if (currentAverage < lowestAverage) {
                lowestAverage = currentAverage;
                hasLowestAverage = array;
            }
        }
        return hasLowestAverage;
    }
}
