package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<String>();
        Scanner scan = new Scanner(new File("data.txt"));
        while(scan.hasNext()){
            words.add(scan.next());
        }
        System.out.println(words);
    }
}
