import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int [][] table = new int[5][10];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
    }
}
