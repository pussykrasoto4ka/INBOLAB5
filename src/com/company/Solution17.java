package com.company;

import java.util.Scanner;

public class Solution17 {
    public Solution17() {
    }

    public static int recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n == 0 ? 0 : Math.max(n, recursion());
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
