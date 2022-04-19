package Problems.Implementation_Constructive;

import java.util.Scanner;

public class Problem4_Soft_Drinking {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int l = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int p = scn.nextInt();
        int nl = scn.nextInt();
        int np = scn.nextInt();

        int totalDrinkInML = k*l;
        int totalSlices = c*d;
        int saltInGrams = p;

        int drinkAvailable = totalDrinkInML/nl;
        int saltAvailable = p /np;

        int numToasts = Math.min(drinkAvailable, Math.min(saltAvailable, totalSlices))/n;
        System.out.println(numToasts);
    }
}