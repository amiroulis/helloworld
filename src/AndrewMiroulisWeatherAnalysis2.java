
import java.util.Arrays;
import java.util.Scanner;

public class AndrewMiroulisWeatherAnalysis2 {
    public static void main(String[] args) {
        weather();
        // calling the weather method, which then calls other methods
    }

    public static void weather() { // creates variables and calls methods which it passes parameters to
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures?");
        int ntemps = input.nextInt();
        int csum = 0;
        int[] temps = new int[ntemps];
        double average = 0;
        double roundaverage = 0;
        int counter = 0;
        csum = temperatures(csum, temps, ntemps, input); //finding cumulative sum
        roundaverage = average1(csum, average, roundaverage, ntemps); // finding the rounded average
        counter = aboveaverage(ntemps, counter, roundaverage, temps);// finding the number of temps that are above average
        System.out.println(counter + " days were above average.");
        System.out.println();
        System.out.println("Temperatures: " + Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[ntemps - 1] + ", " + temps[ntemps - 2]);


    }

    public static int temperatures(int csum, int temps[], int ntemps, Scanner input) { // prints out the temps for each day and returns the cumulative sum, which it calculated
        for (int i = 0; i < ntemps; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp:");
            temps[i] = input.nextInt();
            csum += temps[i];
        }
        return csum;
    }

    public static double average1(int csum, double average, double roundaverage, int ntemps) { // calculates the rounded average and returns it
        average = csum / (double) ntemps;
        roundaverage = (Math.round(average * 10)) / 10.0;
        System.out.println("Average temp = " + roundaverage);
        return roundaverage;


    }

    public static int aboveaverage(int ntemps, int counter, double roundaverage, int temps[]) { // calculates the number of temps above average and returns it
        for (int j = 0; j < ntemps; j++) {
            if (temps[j] > roundaverage) {
                counter++;


            }

        }
        return counter;
    }
}