import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] array = new int[] {5, 8, 7, 12};
        System.out.println(Arrays.toString(array));
       array = abby(array);
        System.out.println(Arrays.toString(array));

    }
    public static void johnnysalgorithm () {

    }


    public static int[] abby (int[] aa) {
        int[] temparray = new int[aa.length];

     for(int i = 0; i < aa.length; i++) {
            temparray[aa.length - i - 1] = aa[i];
        }
        return temparray;

    }


}

