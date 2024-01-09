package combinatorial.algorithms;
/*
 * This algorithm for computing Factorial
 * ***************
 * Time complexity : O(n)
 * Space Complexity : O(n)
 * ***************
 * */

public class Factorial {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}
