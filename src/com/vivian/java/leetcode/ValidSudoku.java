package com.vivian.java.leetcode;
import java.lang.IllegalArgumentException;
/* Determine if a Sudoku is vaild.
   The Sudoku board could be partially filled, where empty cells are character'.'

   claritification: Doed the type of  Input parameters are character? Yes
   edges case: suppose char so[][] ,cnt.length must ==9,cun[0].length must==9

   approach: as Sudoku's features, each rows' elements must no repeated
                                   each column's elements must no repeated
                                   elements in every 3*3 array must no repeated

            create a int cn[9] to store numbers of  each element in so[][] occurr.
            creat a variable(num) to count numbers of rows, columns and 3*3 array
            every numbers in cn[] must less then num, otherwise return false




complexity: runtime complexity
            memory comlexity O(1)
*/
public class ValidSudoku {
    public boolean isSukoku(char[][] arr) {
        if(arr == null || arr.length != 9 || arr[0].length != 9) {
            return false;
        }

        for(int i = 0; i < arr.length; i++) {//ensure each row's elements not repeat
            int[]cnt = new int[9];
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == '.') {
                    continue;
                }
                if(arr[i][j] > '9' || arr[i][j] < '1') {
                    throw new IllegalArgumentException("invaild input");
                }
                if(++cnt[arr[i][j] - '1'] != 1) { //ensure each element represent once
                    System.out.print("Returning false in 1st section for i=" + i + "j=" + j + ", "
                                     + arr[i][j] + " appeared " + cnt[arr[i][j] - '1'] + " expect <= " + 1);
                    return false;
                }
            }
        }

        for(int j = 0; j < arr.length; j++) {//ensure each column's elements not repeat
            int[]cnt = new int[9];
            for(int i = 0; i < arr.length; i++) {
                if(arr[i][j] == '.') {
                    continue;
                }
                if(arr[i][j] > '9' || arr[i][j] < '1') {
                    throw new IllegalArgumentException("invaild input");
                }
                if(++cnt[arr[i][j] - '1'] != 1) {
                    System.out.print("Returning false in 2nd section for i=" + i + "j=" + j + ", "
                                     + arr[i][j] + " appeared " + cnt[arr[i][j] - '1'] + " expect <= " + 1);
                    return false;
                }
            }
        }

        for(int i = 0; i < arr.length; i += 3) {//ensure each 3*3 arry elements not repeat
            for(int j = 0; j < arr.length; j += 3) {
                int[]cnt = new int[9];
                for(int k = 0; k < 3; k++) {
                    for(int h = 0; h < 3; h++) {
                        if(arr[i + k][j + h] == '.') {
                            continue;
                        }
                        if(arr[i + k][j + h] > '9' || arr[i + k][j + h] < '1') {
                            throw new IllegalArgumentException("invaild input");
                        }
                        if(++cnt[arr[i + k][j + h] - '1'] != 1) {
                            System.out.print("Returning false in 3rd section for i+k=" + (i + k) + "j+h=" + (j + h) + ", "
                                             + arr[i + k][j + h] + " appeared " + cnt[arr[i + k][j + h] - '1'] + " expect <= " + 1);
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}