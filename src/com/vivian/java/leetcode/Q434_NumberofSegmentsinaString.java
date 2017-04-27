package com.vivian.java.leetcode;

/**
 * Count the number of segments in a string, where a segment is defined to be a
 * contiguous sequence of non-space characters.
 * 
 * Please note that the string does not contain any non-printable characters.
 * 
 * Example:
 * 
 * Input: "Hello, my name is John" Output: 5
 */
public class Q434_NumberofSegmentsinaString {
    public int numberOfSegmentSinaString(String str) {
        int count = 0;
        boolean flag=false;
        if (str.isEmpty() || str == null) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c==' ') {
                if(flag==false){
                    flag=true;
                }
            }
            else if(c!=' '){
                if(flag==true){
                    count++;
                    flag=false;
                }
                
            }
            if (i == str.length() - 1) {
                count++;
            }
        }
        return count;
    }
}
