package com.company;

import java.util.Scanner;

public class Solution12 {
    public Solution12() {
    }

    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                recursion();
            } else {
                recursion();
            }
        }

    }

    public static void main(String[] args) {
        recursion();
    }
}
