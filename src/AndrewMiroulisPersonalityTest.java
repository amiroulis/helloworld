import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class AndrewMiroulisPersonalityTest {
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner input = new Scanner(System.in);
        Scanner scan = inputName(input);
        PrintStream output = new PrintStream(input.next());

    }
    public static Scanner inputName(Scanner input) throws FileNotFoundException {
        System.out.print("Input File: ");
        String name = input.next();
        while (!(new File(name).exists())){
            System.out.print("File name is invalid. Please try again.");
            name = input.next();
        }
        Scanner scan = new Scanner(new File(name));
        return scan;
    }
 //   public static void

}
