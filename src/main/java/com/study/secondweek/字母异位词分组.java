package com.study.secondweek;

import java.util.*;

public class 字母异位词分组 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        Map<String,List<String>> tempMap = new HashMap<>();
        List<String> tempList;
        for (String eachStr:strs) {
            char[] eachArray = eachStr.toCharArray();
            Arrays.sort(eachArray);
            String sortedStr = new String(eachArray);
            if(tempMap.containsKey(sortedStr)){
                tempList = tempMap.get(sortedStr);
                tempList.add(eachStr);
            }else{
                tempList = new ArrayList<>();
                tempList.add(eachStr);
                tempMap.put(sortedStr, tempList);
            }
        }

        tempMap.forEach((key,value) -> {
            resultList.add(value);
        });

        return resultList;
    }

}
