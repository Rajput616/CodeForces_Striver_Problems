package Problems.Implementation_Constructive;

import java.util.Scanner;

public class Problem10_Easy_Hard_Problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean isEasy = true;
        for(int i = 0; i < n; ++i){
            int num = scn.nextInt();
            if(num == 1) {
                isEasy = false;
            }
        }
        System.out.println(isEasy ? "Easy" : "Hard");
    }
}
