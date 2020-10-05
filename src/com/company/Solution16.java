package com.company;

import java.util.Scanner;

public class Solution16 {
    public Solution16() {
    }

    public static void recursion(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            } else if (n == max) {
                ++count;
                recursion(max, count);
            } else {
                recursion(max, count);
            }
        } else {
            System.out.println(count);
        }

    }

    public static void main(String[] args) {
        recursion(0, 0);
    }
}
