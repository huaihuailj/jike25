package com.study.firstweek;

/**
 * @program: jike25
 * @author: LIULJ
 * @create: 2021-04-04 18:55
 * @description:
 */
public class 盛最多水的容器 {

    public int maxArea(int[] height) {
        if(height == null){
            return 0;
        }
        int temp = 0;
        for (int i = 0,j=height.length-1; i < j;) {
            int minHeight = height[i]<height[j] ? height[i++] : height[j--];
            int area = (j-i+1)*minHeight;
            temp = Math.max(temp,area);
        }
        return temp;
    }

}
