package com.company;

public class Solution5 {
    private static int n = 0;

    public Solution5() {
    }

    public static int rec(int N) {
        if (N != 0) {
            N /= 10;
            ++n;
            return rec(N);
        } else {
            if (N == 0) {
                System.out.println(n);
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        rec(1738);
    }
}

