package com.vivian.java.leetcode;

/**
 * You are given a string representing an attendance record for a student. The
 * record only contains the following three characters:
 * 
 * 'A' : Absent. 'L' : Late. 'P' : Present.
 * 
 * A student could be rewarded if his attendance record doesn't contain more
 * than one 'A' (absent) or more than two continuous 'L' (late).
 * 
 * You need to return whether the student could be rewarded according to his
 * attendance record.
 * 
 * Example 1:
 * 
 * Input: "PPALLP" Output: True
 * 
 * Example 2:
 * 
 * Input: "PPALLL" Output: False
 */
public class Q551_StudentAttendanceRecordI {
    public boolean beRewarded(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int countA = 0;
        int countL = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                countA++;
            } else if (str.charAt(i) == 'L') {
                countL++;
            }

        }
        if (countA <= 1 && countL <= 2) {
            return true;
        }
        return false;
    }
}
