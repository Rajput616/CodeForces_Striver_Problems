package Problems.Implementation_Constructive;

import java.util.Scanner;

public class Problem7_Fox_and_Snake {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        char[][] grid = new char[n][m];

        boolean isLast = true;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                if(i%2 == 0 || (j == 0 && !isLast) || (j == m-1 && isLast)) grid[i][j] = '#';
                else grid[i][j] = '.';
            }
            if(i%2 != 0)
                isLast = !isLast;
        }
        for(char[] g : grid){
            for(char ch : g){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}

