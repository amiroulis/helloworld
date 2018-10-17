public class Mode {
    public static void main(String[] args) {
        int number = 123456789;
        mode(number);
       // mode2(number);

    }
    public static void mode(int number) {
        int[] array = new int[10];
        int max = 0;
        int mode = 0;
        while (number > 0) {
            array[number % 10]++;
            number /= 10;
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {

                max = array[i];
                mode = i;

            }

        }
        System.out.print(mode);

        }

    public static void mode2(int number) {
        int c0 = 0;
        int c1 = 1;
        int c2 = 2;
        int c3 = 3;
        int c4 = 4;
        int c5 = 5;
        int c6 = 6;
        int c7 = 7;
        int c8 = 8;
        int c9 = 9;
        int[] array2 = new int[10];
        while (number > 0){
        if(number % 10 == c0) {
            c0++;
        }
        else if(number % 10 == c1) {
            c1++;
        }
        else if(number % 10 == c2) {
            c2++;
        }
        else if(number % 10 == c3) {
            c3++;
        }
        else if(number % 10 == c4) {
            c4++;
        }
        else if(number % 10 == c5) {
            c5++;
        }
        else if(number % 10 == c6) {
            c6++;
        }
        else if(number % 10 == c7) {
            c7++;
        }
        else if(number % 10 == c8) {
            c8++;
        }
        else if(number % 10 == c0) {
            c0++;
        }
        





    }

}
}
