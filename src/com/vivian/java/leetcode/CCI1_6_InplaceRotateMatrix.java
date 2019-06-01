package com.vivian.java.leetcode;
/* given an image represented by an N*N,where each piexl in the image is 4 Bytes,
*write a method to rotate the image by 90 degrees,
*do it in place

* claritification: rotate by clockwise,not empty c-style String, integer array
*
* approach: make N*N matrix into laysers (N/2), iterator from outermost edges
* four_point(need to rotate) in each layers connect to a square flat
* find out relationship repersnt in i,j
* [i][j], [j][n-i-1], [n-i-1][n-j-1], [n-j-1][i]

*complexcity o(n logn)
*/


public class CCI1_6_InplaceRotateMatrix {
    public int[][] inplaceRotateMatrix (int[][] matr, int n) {
        for(int i = 0; i < n / 2; i++) { //total layers== n/2
            for(int j = i; j < n - i - 1; j++) { //j=i each layers begins,[n-i-1] is the spot where leftTop switch to
                int temp = matr[i][j];//hold the leftTop
                matr[i][j] = matr[n - j - 1][i]; //leftBottom go to leftTop
                matr[n - j - 1][i] = matr[n - i - 1][n - j - 1]; //rightBottom go to leftBottom
                matr[n - i - 1][n - j - 1] = matr[j][n - i - 1]; //rightTop to the rightBottom
                matr[j][n - i - 1] = temp; //leftTop to the rightTop
            }
        }
        return matr;
    }
}