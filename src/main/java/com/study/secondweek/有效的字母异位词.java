package com.study.secondweek;

import java.util.Arrays;

public class 有效的字母异位词 {

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        if(sChars.length != tChars.length){
            return false;
        }
        for (int i = 0; i < sChars.length; i++) {
            if(sChars[i] != tChars[i]){
                return false;
            }
        }
        return true;
    }

}
