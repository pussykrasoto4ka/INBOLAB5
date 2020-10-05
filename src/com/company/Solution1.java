package com.company;

public class Solution1 {
    public Solution1() {
    }

    public static int recursion(int n) {
        int N = n;
        if (n == 1) {
            return 1;
        } else {
            while(N != 0) {
                System.out.println(n);
                --N;
            }

            return recursion(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
}