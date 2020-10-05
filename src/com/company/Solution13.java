package com.company;

import java.util.Scanner;

public class Solution13 {
    public Solution13() {
    }

    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion();
            }
        }

    }

    public static void main(String[] args) {
        recursion();
    }
}