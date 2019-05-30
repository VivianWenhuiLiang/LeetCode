package com.vivian.java.leetcode;

/**
* write a method ro replace all spaces in a string with '%20'
*For example: "a, ,b, ,s, , ,'\0'; replace to a,%,2,0,b,%,2,0,c,%,2,0,%,2,0,%,2,0,'\0'

*clarification: is a C-style string,must ends with '\0'?(yes)
*               enough capacity ,modifay inplace?(yes)

* approach: count spaces, find out the arr_length(not include '\0')for reverse iterator
*           reverse iterator from'\0'，and move each char(not space) to newIndex=index+count*2
*                                    while space,count--,and inplace '%20'
*  complexity : each char visited twice
*                  o(n)
*/
public class CCI1_5_ReplaceAllSpaces {
    public char[] replaceSpaces(char[]s) {
        int count = 0;
        int len = 0;
        for( ; s[len] != '\0' && len < s.length; len++) { //if arry exclude'\0' even iterator out of len,or if '\0'in the mid of arry
            if(s[len]==' '){
                count++;
            }
        }//len is the size of []s
        if(s.length<((count*2)+len+1)){//1 is a spot for'\0'
            throw new RuntimeException();
        }
        s=inPlace (s,len,count, new char[]{'%','2','0'} );
        return s;
    }

    public char[] inPlace(char[]s, int len,int count,char[]in){
        for(int i=len;i>=0;i--){
            if(s[i]==' '){
                count--;
                for(int j=0;j<in.length;j++){
                    s[i+(count*2)+j]=in[j];
                }
            }else{
                s[i+(count*2)]=s[i];
            }
        }
        return s;
    }
}
