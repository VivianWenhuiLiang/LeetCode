package com.vivian.java.leetcode;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * For example, given numRows = 5, Return
 *
 * <pre>
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * </pre>
 *clarification:what's the maxmun of n,should I consider over flow,max number is 2(31)-1 (in the mid)
 *edge case:first element in pascal's tridngle must locat [0][0]==1;
 *          every rows in column j[0] must be 1;
 *          while i=j,[i][j]must be 1;
 *
 *approach: by the given parameter n, we know rows(n rows);
 *          each column's elements == rows index(from 0) +1;
 *          the rest of  [i][j]==[i-1][j-1]+[i-1][j];
 *complexity:depends on given parament n,O(n);
 */
public class Q118_PascalsTriangle {
    public int[][] pascalsTriangle(int n) {
        int[][] nums = new int[n][];// only can generate first-dimensional's length,second's not certain(only java )
        for (int i = 0; i < n; i++) {
            nums[i] = new int[i + 1];//first_fearture
            nums[i][0] = 1;//second_feature
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    nums[i][j] = 1;//thirth_feature
                } else {
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }
            }
        }
        return nums;
    }
    public static void main(String [] args) {
        System.out.println("Q118 main");
        Q118_PascalsTriangle test = new Q118_PascalsTriangle();
        test.pascalsTriangle(1);
        printResult(test.pascalsTriangle(1),1);
        test.pascalsTriangle(2);
        printResult(test.pascalsTriangle(2),2);
        test.pascalsTriangle(3);
        printResult(test.pascalsTriangle(3),3);
        test.pascalsTriangle(4);
        printResult(test.pascalsTriangle(4),4);
        test.pascalsTriangle(5);
        printResult(test.pascalsTriangle(5),5);
    }

    public static void printResult(int[][] arr, int n) {
        for (int i = 0; i<n; i++) {
            for(int j = 0; i >= j; j++) {
                System.out.print(arr[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

}
