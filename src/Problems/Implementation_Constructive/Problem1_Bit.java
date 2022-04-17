package Problems.Implementation_Constructive;

import java.util.Scanner;

public class Problem1_Bit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 0;
        int n = scn.nextInt();
        for(int i = 0; i < n; ++i){
            String s = scn.next();
            if(s.charAt(0) == '+' || s.charAt(2) == '+') x++;
            else x--;
        }
        System.out.println(x);
    }
}
