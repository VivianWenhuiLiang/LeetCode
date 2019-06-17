package com.vivian.java.leetcode;
/* assume you have a method is Substring which one word is a substring of another.
  Give two strings, S1 and S2,write code to check if S2 is rotation of S1,using Only one call to isSubstring
  (eg: waterbottle is a rotation of erbottlewat )

  claritification: s2 is a rotation of s1,must s1.len=s2.len
                  (rotation: move like clockwise)
 approach:s1.len==s2.len,if not return false
          S2 must is substring of S1+S1
 complexcity: o(n),momery is O(n)
 */
public class CC1_8_isRotation {
    public boolean isRotation(String s1, String s2) {
        if(s1.length() == s2.length() && s1.length() > 0) {
            String ss1 = s1 + s1;
            return isSubstring(ss1, s2);
        }
        return false;
    }

    public boolean isSubstring(String s1, String s2) {
        if(s1.length() < s2.length() || s1.length() == 0 || s2.length() == 0) {
            return false;
        }
        int j;
        for(int i = 0; i <= s1.length() - s2.length(); i++) {
            for(j = 0 ; j < s2.length(); j++) {
                if(s2.charAt(j)!=s1.charAt(j+i)) {
                    break;
                }
            }
            if(j == s2.length()) {
                return true;
            }
        }
        return false;
    }
}