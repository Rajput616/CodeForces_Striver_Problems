import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int len = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); ++i){
            int digit = s.charAt(i) - '0';
            if((i == 0 && digit == 9) || digit < 5) ans.append(digit);
            else ans.append(9 - digit);
        }
        System.out.println(ans);
    }
}
