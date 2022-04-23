package Problems.Implementation_Constructive;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem6_Round_Numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            ArrayList<Integer> ans = new ArrayList<>();
            int div = 100000;
            while(n > 0){
                int pop = n / div;
                if(pop > 0){
                    ans.add(pop * div);
                }
                n %= div;
                div /= 10; // 1000 - 9000
            }
            System.out.println(ans.size());
            for(int val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}