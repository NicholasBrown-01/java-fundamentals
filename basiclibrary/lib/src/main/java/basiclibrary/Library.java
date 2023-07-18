/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {


    public static void main(String[] args) {
        List<String> votes = new ArrayList<>(); //https://canvas.instructure.com/courses/7139363/assignments/38486896?return_to=https%3A%2F%2Fcanvas.instructure.com%2Fcalendar%23view_name%3Dmonth%26view_start%3D2023-07-12

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }

    //Thank you Tony, for explaining no need for public void Main

    // Roll Method
    public int[] rollMethod(int userRolls) {


        Random random = new Random();

        int[] diceArray = new int[userRolls];

        for (int i = 0; i < userRolls; i++) {
            diceArray[i] = random.nextInt(6) + 1;
        }
        return diceArray;
    }

    // Contains Duplicates Method
    public boolean containsDuplicatesMethod(int[] firstArray) {

        // Now completely iterates through the array with a nested loop. Help from gpt.
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = i + 1; j < firstArray.length; j++)
                if (firstArray[i] == firstArray[j]) {
                    return true;
                }

        }

        return false;
    }

    //help from JavaCodeGeeks site

    // Calculating Averages Method
    public float averagingMethod(int[] array) {

        float lastSum = 0;
        for (int i = 0; i < array.length; i++) {
            lastSum += array[i];
        }
        float averageOfArray = lastSum / array.length;

        return averageOfArray;
    }
    // help from javacodegeeks, javatpoint, TA's, stackoverflow, tutorialspoint, gpt.

    // Array of Arrays
    public int[] arrayAverager() {

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] lowestAvgArray = weeklyMonthTemperatures[0]; // have to have this to begin comparing
        float lowestAvg = averagingMethod(weeklyMonthTemperatures[0]);

        for (int i = 1; i < weeklyMonthTemperatures.length; i++) {
            float currentAvg = averagingMethod(weeklyMonthTemperatures[i]);
            if (currentAvg < lowestAvg) {
                lowestAvg = currentAvg;
                lowestAvgArray = weeklyMonthTemperatures[i];
            }
        }

        return lowestAvgArray;
    }

    /////////////// LAB 03 ///////////////////

    // ANALYZING WEATHER DATA

    public String weatherArrayMissingTemps(int[][] monthlyTempsArray) {

        int[][] MonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        HashSet<Integer> uniqueTemps = new HashSet<>();

        for (int[] WeekTemperatures : monthlyTempsArray) {
            for (int innerTemperature : WeekTemperatures) {
                if (innerTemperature < minTemp) {
                    minTemp = innerTemperature;
                }
                if (innerTemperature > maxTemp) {
                    maxTemp = innerTemperature;
                }
                uniqueTemps.add(innerTemperature);
            }
        }
        StringBuilder tempResults = new StringBuilder();
        tempResults.append("High: ").append(maxTemp).append("\n");
        tempResults.append("Low: ").append(minTemp).append("\n");

        for (int i = minTemp; i < maxTemp; i++) {
            if (!uniqueTemps.contains(i)) {
                tempResults.append("Never saw temperature: ").append(i).append("\n");
            }
        }
        return tempResults.toString();
    }

    // TALLYING ELECTION

    public static String tally(List<String> votes) {
        HashMap<String, Integer> voteCounts = new HashMap<>(); //https://github.com/codefellows/seattle-code-java-401d18/tree/main/class-03/demo
        for (String vote : votes) { //https://www.youtube.com/watch?v=t8mmNbgKA8w
            if (voteCounts.containsKey(vote)) { //https://www.programiz.com/java-programming/library/hashmap/containskey
                voteCounts.put(vote, voteCounts.get(vote) + 1); //https://stackoverflow.com/questions/60614781/difference-between-hashmaps-put-and-add
            } else {
                voteCounts.put(vote, 1);
            }
        }

        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) { //https://www.geeksforgeeks.org/map-entry-interface-java-example/
            if (winner == null || entry.getValue() > maxVotes) {
                winner = entry.getKey();
                maxVotes = entry.getValue(); //overall calculation of this corrected by GPT
            }
        }

        return winner;
    }
}