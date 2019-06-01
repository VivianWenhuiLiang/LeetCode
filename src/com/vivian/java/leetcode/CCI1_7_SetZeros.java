package com.vivian.java.leetcode;
/*
write an algorithm if an element in M*N matrix is 0, set its entire row and column to 0

clarification: integer type c_style string

approach: iterator matrix ,new int[M][N] to mark down if[i][j]==0
          for one loop ,iterator new[M][N],if element==0,set origin string entire row and column to 0
complexcity: o(string.length);
*/


public class CCI1_7_SetZeros {
    public int[][] setZeros(int[][] arr) {
        int[] rows = new int [arr.length]; //consist by arr[0],arr[1]~arr[length-1]
        int[] columns = new int [arr[0].length];
        for(int i = 0; i < rows.length; i++) { //for each arr[i]
            for(int j = 0; j < columns.length; j++) { //each element in arr[i]
                if(arr[i][j] == 0) {
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }

        for(int i = 0; i < rows.length; i++) {
            for(int j = 0; j < columns.length; j++) {
                if(rows[i] == 1 || columns[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}