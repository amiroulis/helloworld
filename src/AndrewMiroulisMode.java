public class AndrewMiroulisMode {
    public static void main(String[] args) {
        int number = 669260267;
        mode(number);


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
}
