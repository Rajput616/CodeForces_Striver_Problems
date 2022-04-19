package Problems.Implementation_Constructive;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5_Meeting_Friends {
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