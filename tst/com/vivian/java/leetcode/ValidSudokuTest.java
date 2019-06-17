package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class ValidSudokuTest {
    private ValidSudoku solution = new ValidSudoku();

    @Test
    public void test() {
        char [][] tester = new char[][] {{'2', '7', '1', '9', '5', '4', '6', '8', '3'}, 
        {'5','9','3','6','2','8','1','4','7'},
        {'4','6','8','1','3','7','2','5','9'},
        {'7','3','6','4','1','5','8','9','2'},
        {'1','5','9','8','6','2','3','7','4'},
        {'8','4','2','3','7','9','5','6','1'},
        {'.','8','5','.','4','1','7','3','6'},
        {'6','1','7','.','.','.','4','2','8'},
        {'3','2','4','7','8','6','9','.','5'}
    };
    char [][] tester2 = new char[][] {{'2', '7', '1', '9', '5', '4', '6', '8', '3'}, 
        {'5','9','3','6','2','8','1','4','7'},
        {'4','6','8','1','3','7','2','5','9'},
        {'7','3','6','4','1','5','8','9','2'},
        {'1','.','9','8','6','2','3','7','4'},
        {'8','4','2','3','7','5','5','6','1'},
        {'.','8','5','.','4','1','7','3','6'},
        {'6','1','7','.','.','.','4','2','8'},
        {'3','2','4','7','8','6','9','.','5'}
    };
        Assert.assertEquals(false,solution.isSukoku(tester2));

    }
}
