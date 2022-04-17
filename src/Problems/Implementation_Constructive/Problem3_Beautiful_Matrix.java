package Problems.Implementation_Constructive;

import java.util.Scanner;

public class Problem3_Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] matrix = Input.matrix(5,5);
        int i = 0, j = 0;
        boolean isOneFound = false;
        for(; i < 5; ++i){
            for(j = 0; j < 5; ++j){
                if(matrix[i][j] == 1) {
                    isOneFound = true;
                    break;
                }
            }
            if(isOneFound) break;
        }
        int maxMoves = Math.abs(2 - i) + Math.abs(2 - j);
        System.out.println(maxMoves);
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
