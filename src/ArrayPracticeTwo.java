import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeTwo {
    public static void main(String[] args) {
       /* int x;
        x = 5;
        int y = 5; */
      // int x = ((int)(Math.random()*10)) + 1;
        Scanner input = new Scanner(System.in);
        System.out.print("How big would you like the array to be?");
        int value = input.nextInt();
        int[] numbers1 = new int[value];

        for(int i = 0; i < value; i++) {
            numbers1[i] = ((int)(Math.random()*10)) + 1;
        }
        System.out.println(Arrays.toString(numbers1));// After populating the array
      //  int[] numbers2 = new int[5];


    }

}
