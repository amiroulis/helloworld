import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class AndrewMiroulisPersonality {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner scan = inputName(input);
        System.out.print("Output file name: ");
        PrintStream output = new PrintStream(input.next());
        count(scan, output);


    }

    public static Scanner inputName(Scanner input) throws FileNotFoundException {
        System.out.print("Input file name: ");
        String name = input.next();
        while (!(new File(name).exists())) {
            System.out.print("File not found. Try again: ");
            name = input.next();
        }
        Scanner scan = new Scanner(new File(name));
        return scan;
    }

    public static void count(Scanner scan, PrintStream output) throws FileNotFoundException {
        while (scan.hasNextLine()) {
            String name = scan.nextLine();
            String answers = scan.nextLine();
            int[] aCount = new int[4];
            int[] bCount = new int[4];
            for (int counter = 1; counter <= 70; counter++) {
                if (answers.charAt(counter - 1) == 'A' || answers.charAt(counter - 1) == 'a') {
                    if (counter % 7 == 1) {
                        aCount[0]++;
                    } else if (counter % 7 == 2 || counter % 7 == 3) {
                        aCount[1]++;
                    } else if (counter % 7 == 4 || counter % 7 == 5) {
                        aCount[2]++;
                    } else if (counter % 7 == 6 || counter % 7 == 0) {
                        aCount[3]++;
                    }

                } else if (answers.charAt(counter - 1) == 'B' || answers.charAt(counter - 1) == 'b') {
                    if (counter % 7 == 1) {
                        bCount[0]++;
                    } else if (counter % 7 == 2 || counter % 7 == 3) {
                        bCount[1]++;
                    } else if (counter % 7 == 4 || counter % 7 == 5) {
                        bCount[2]++;
                    } else if (counter % 7 == 6 || counter % 7 == 0) {
                        bCount[3]++;
                    }

                }
            }

            int[] bPercent = bpercent(bCount, aCount);
            String type = type(bPercent);
            print(aCount, bCount, bPercent, type, name, output);

        }

    }

    public static int[] bpercent(int[] bCount, int[] aCount) {
        int[] bPercent = new int[4];
        for (int i = 0; i < 4; i++) {
            int total = aCount[i] + bCount[i];
            bPercent[i] = (int) ((bCount[i] / (double) total) * 100);

        }
        return bPercent;

    }

    public static String type(int[] bPercent) {
        String majorB = "INFP";
        String majorA = "ESTJ";
        String type = "";
        for (int i = 0; i < 4; i++) {
            if (bPercent[i] > 50) {
                type += majorB.charAt(i);

            } else if (bPercent[i] < 50) {
                type += majorA.charAt(i);
            } else {
                type += "X";
            }
        }
        return type;
    }

    public static void print(int[] aCount, int[] bCount, int[] bPercent, String type, String name, PrintStream output) {
        output.println(name);
        output.println();
        for (int i = 0; i < 4; i++) {
            output.print(aCount[i] + "A-" + bCount[i] + "B" + " ");
        }
        output.println();
        output.println();
        output.print("[" + bPercent[0] + "%");
        for (int i = 1; i < 4; i++) {
            output.print(", " + bPercent[i] + "%");
        }
        output.println("]");
        output.println();
        output.println("= " + type);
        output.println();

    }
}
