package com.company;

public class Solution9 {
    public Solution9() {
    }

    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        } else {
            return a != 0 && b != 0 ? recursion(a, b - 1) + recursion(a - 1, b - 1) : 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(5, 8));
    }
}
