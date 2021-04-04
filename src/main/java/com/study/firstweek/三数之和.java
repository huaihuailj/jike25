package com.study.firstweek;

import java.util.*;

/**
 * @program: jike25
 * @author: LIULJ
 * @create: 2021-04-04 18:57
 * @description:
 */
public class 三数之和 {

    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int temp = nums[i] + nums[left] + nums[right];
                if(temp == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    while(left < right && nums[left] == nums[++left]);
                    while(left < right && nums[right] == nums[--right]);
                }else if(temp < 0){
                    while(left < right && nums[left] == nums[++left]);
                }else{
                    while(left < right && nums[right] == nums[--right]);
                }
            }
        }

        List<List<Integer>> listResult = new ArrayList<>();
        result.forEach(list -> {
            listResult.add(list);
        });
        return listResult;
    }

}
