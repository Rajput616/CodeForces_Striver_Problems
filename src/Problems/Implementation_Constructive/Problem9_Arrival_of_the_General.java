package Problems.Implementation_Constructive;

import java.util.Scanner;

public class Problem9_Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = scn.nextInt();
        int max = num, maxFirstIndex = 0;
        int min = num, minLastIndex = 0;

        for(int i = 1; i < n; ++i){
            num = scn.nextInt();
            if(num > max){
                max = num;
                maxFirstIndex = i;
            }

            if(num <= min){
                min = num;
                minLastIndex = i;
            }
        }
        int ans = maxFirstIndex + (n - minLastIndex - 1);
        if(minLastIndex < maxFirstIndex) ans--;
        System.out.println(ans);
    }
}
