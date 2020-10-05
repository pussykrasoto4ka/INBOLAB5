package com.company;

public class Solution7 {
    public Solution7() {
    }

    private static int recursion(int n, int var) {
        if (n > 1) {
            if (n % var == 0) {
                System.out.println(var);
                return recursion(n, var + 1);
            }

            if (n % var != 0 && var < n) {
                return recursion(n, var + 1);
            }

            if (n == var) {
                System.out.println(n);
                return 0;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        recursion(7, 7);
    }
}