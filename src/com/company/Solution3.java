package com.company;

public class Solution3 {
    public Solution3() {
    }

    public static String recursion(int a, int b) {
        if (a > b) {
            return a == b ? Integer.toString(a) : a + " " + recursion(a - 1, b);
        } else {
            return a == b ? Integer.toString(a) : a + " " + recursion(a + 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(20, 15));
        System.out.println(recursion(10, 15));
    }
}