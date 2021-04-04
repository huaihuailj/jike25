package com.study.firstweek;

/**
 * @program: jike25
 * @author: LIULJ
 * @create: 2021-04-04 18:56
 * @description:
 */
public class 移动零 {

    public void moveZeroes(int[] nums) {
        if(nums == null){
            return;
        }
        int j = 0;
        for(int i = 0;i<nums.length;i++ ){
            if(nums[i] != 0){
                nums[j] = nums[i];
                if(i != j){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

}
