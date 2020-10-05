package com.company;

public class Solution15 {
    public Solution15() {
    }

    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            String var10000 = recursion(n / 10);
            return var10000 + " " + n % 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(153));
    }
}