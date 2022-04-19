import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scn.nextInt();
        arr[1] = scn.nextInt();
        arr[2] = scn.nextInt();
        Arrays.sort(arr);
        System.out.println(Math.abs(arr[0]-arr[1]) + Math.abs(arr[1] - arr[2]));

    }
}

class Input{
    public static int[] array(int size){
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i = 0; i < size; ++i) arr[i] = scn.nextInt();
        return arr;
    }

    public static int[][] matrix(int rows, int cols){
        Scanner scn = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < cols; ++j){
                matrix[i][j] = scn.nextInt();
            }
        }
        return matrix;
    }
}
