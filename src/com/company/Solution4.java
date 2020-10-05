package com.company;

public class Solution4 {
    public Solution4() {
    }

    public static int recursion(int len, int sum, int k, int s) {
        if (len == k) {
            return sum == s ? 1 : 0;
        } else {
            int c = len == 0 ? 1 : 0;
            int res = 0;

            for(int i = c; i < 10; ++i) {
                res += recursion(len + 1, sum + i, k, s);
            }

            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(0, 0, 3, 15));
    }
}

