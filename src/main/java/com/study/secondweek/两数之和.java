package com.study.secondweek;

import java.util.HashMap;
import java.util.Map;

public class 两数之和 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> tempMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(tempMap.containsKey(target-nums[i])){
                return new int[]{tempMap.get(target-nums[i]),i};
            }
            tempMap.put(nums[i],i);
        }
        return new int[0];
    }

}
