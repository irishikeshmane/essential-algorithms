package combinatorial.algorithms;

import util.PropertyStrings;

import java.util.Optional;

/*
 * This algorithm for computing Fibonacci
 * ***************
 * Time complexity : O(2 ^ n) - Bruteforce solution
 *                 : O(n) - Dynamic Programming Solution
 * Space Complexity : O(n)
 * NOTE: Fibonacci  number is a special case of ADDITIVE Series
 *       e.g. 2,4,6,10,16,26,... -> where Base B1 = 2 and B2 = 4
 *       likewise in case of Fibonacci series Bases B1 = 0 and B2 = 1;
 * ***************
 * */
public class Fibonacci {

    public static int[] result;

    public static int[] getFibonacciSeries(int num, PropertyStrings property, Optional<Integer> b1, Optional<Integer> b2) {
        if (property.equals(PropertyStrings.SERIES)) {
            result = new int[num];
            getAdditiveSeq(num, b1.orElse(0), b2.orElse(1));
        } else {
            result = new int[1];
            result[0] = getFibonacciNum(num);
        }
        return result;
    }

    private static int getFibonacciNum(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return getFibonacciNum(num - 1) + getFibonacciNum(num - 2);
        }
    }

    private static void getAdditiveSeq(int num, int b1, int b2) {
        if (num == 0) {
            result[num] = b1;
            return;
        } else {
            getAdditiveSeq(num - 1, b2, b1 + b2);
        }
    }
}
