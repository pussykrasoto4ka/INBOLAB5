package com.company;

import java.util.Scanner;

public class Solution11 {
    public Solution11() {
    }

    public static int recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m;
        if (n == 1) {
            m = in.nextInt();
            if (m == 1) {
                return recursion() + n + m;
            } else {
                int k = in.nextInt();
                return k == 1 ? recursion() + n + m + k : n + m + k;
            }
        } else {
            m = in.nextInt();
            return m == 1 ? recursion() + n + m : n + m;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}