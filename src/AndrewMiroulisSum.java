import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;

public class AndrewMiroulisSum {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("sum.txt"));
        //  Scanner scan2 = new Scanner(scan.nextLine());
        printFile(scan /*scan2 */);
     /*   Scanner scan3 = new Scanner(new File("sum.txt"));
        Scanner scan4 = new Scanner(new File("sum.txt"));
        Scanner line = new Scanner(scan.nextLine());
        scan = scan2;
        Scanner line2 = new Scanner(scan.nextLine());
        scan = scan3;
        int nonzero = 0;
        String num = scan.next();
        scan = scan4;
        String num1 = "";
        String num2 = "";
        int linelength = 0;
        int arrlength = 25;
        // int counter = 0;

        while(scan.hasNextLine()) {
            scan.nextLine();

            while (line.hasNextInt()) {
                linelength++;
                line.nextInt();
            }
            while (line2.hasNextInt()) {
                for (int i = 0; i < linelength; i++) {
                    String[] array = new String[arrlength];
                    String[] total = new String[arrlength];
                    String[] array2 = new String[arrlength];
                    for (int j = 0; j < arrlength; j++) {
                        if (arrlength <= (arrlength - 1 - j) + (num.length())) {
                            array[arrlength - 1 - j] = "" + Character.getNumericValue(num.charAt(num.length() - 1 - j));
                        } else {
                            array[arrlength - 1 - j] = "0";
                        }
                    }
                    for(int n = 0; n < arrlength; n++) {
                        if (!(array[n].equals("0"))) {
                            nonzero++;
                            num1 += array[n];

                        }
                        else if(nonzero > 0) {
                            num1 += array[n];
                        }
                    }
                    nonzero = 0;
                    if (linelength > 1 && i + 1 != linelength) {

                        num = line2.next();

                        for (int k = 0; k < arrlength; k++) {
                            if (arrlength <= (arrlength - 1 - k) + (num.length())) {
                                array[arrlength - 1 - k] = "" + Character.getNumericValue(num.charAt(num.length() - 1 - k));
                            } else {
                                array[arrlength - 1 - k] = "0";

                            }
                        }
                        for(int n = 0; n < arrlength; n++) {
                            if (!(array2[n].equals("0"))) {

                                num2 += array2[n];
                            } else if (nonzero > 0) {
                                num2 += array2[n];
                            }
                        }
                        nonzero = 0;


                        for (int l = 0; l < arrlength; l++) {
                            total[total.length - l - 1] = "" + ((Character.getNumericValue(array[array.length - 1 - l].charAt(0)) + (Character.getNumericValue(array2[array2.length - 1 - l].charAt(0)))) % 10);
                            if (((Character.getNumericValue(array[array.length - 1 - l].charAt(0)) + (Character.getNumericValue(array2[array2.length - 1 - l].charAt(0)))) > 9)) {
                                total[total.length - 1 - 2] = "" + (Character.getNumericValue(total[total.length - 1 - 2].charAt(0)) + 1);
                            }
                        }
                        num = "";
                        for(int n = 0; n < arrlength; n++) {
                            if (!(total[n].equals("0"))){
                                nonzero++;
                                num += total[n];
                            }
                            else if(nonzero > 0) {
                                num += total[n];
                            }

                        }
                        System.out.println(num1 + " + " + num2 + " = " + num);
                        line2.next();


                    }
                    else {
                        for (int l = 0; l < arrlength; l++) {
                            total[total.length - l - 1] = "" + ((Character.getNumericValue(array[array.length - 1 - l].charAt(0))));

                        }
                        nonzero = 0;
                        for(int m = 0; m < arrlength; m++) {
                            total[m] = array[m];
                            num = "";
                            for(int n = 0; n < arrlength; n++) {
                                if (!(total[n].equals("0"))){
                                    nonzero++;
                                    num += total[n];
                                }
                                else if(nonzero > 0) {
                                    num += total[n];
                                }


                            }

                        }
                        System.out.println(num1 + " = " + num);
                        line2.next();

                    }
                }


            }

        }



    } */

    }

    public static void printFile(Scanner scan) throws FileNotFoundException {
        String text = "";
        while (scan.hasNextLine()) {
            text = scan.nextLine();
             Scanner line = new Scanner(text);

            while(line.hasNext()) {
                System.out.print(line.next() + " ");


            }
             System.out.println();
        }
    }
}