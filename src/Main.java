import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {2, 3, 4}};

        int[] resultArray = new int[6];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j > 0; j--) {
                resultArray[count] = array[i][j];
                System.out.println(resultArray[count]);
                count++;
            }
        }
    }
}
//1 2 3
//2 3 4