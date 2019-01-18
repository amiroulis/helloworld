package Ch10ArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        System.out.println(students);
        students.add("Matt");
        students.add("Johnny");
        System.out.println(students);
      /*  if (students.contains("Johnny")) {
            students.remove("Johnny");
        } */
        System.out.println(students);
        //students.clear();
        System.out.println(students);
    for (int i = 0; i < students.size(); i++) {
        if(students.get(i).startsWith("M")) {
            System.out.println("YUY");
        }
    }



    }


}
