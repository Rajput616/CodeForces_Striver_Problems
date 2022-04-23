package Problems.Implementation_Constructive;

import java.util.HashMap;
import java.util.Scanner;

public class Problem8_Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('T', 4);
        map.put('C', 6);
        map.put('O', 8);
        map.put('D', 12);
        map.put('I', 20);
        long ans = 0;
        for(int i = 0; i < n; ++i){
            String s = scn.next();
            char ch = s.charAt(0);
            ans += map.get(ch);
        }
        System.out.println(ans);
    }
}
