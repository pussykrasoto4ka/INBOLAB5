package com.company;

public class Solution2 {
    public Solution2() {
    }

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        } else {
            String var10000 = recursion(n - 1);
            return var10000 + " " + n;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(10));
    }
}