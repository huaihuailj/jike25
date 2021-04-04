package com.study.firstweek;

/**
 * @program: jike25
 * @author: LIULJ
 * @create: 2021-04-04 18:57
 * @description:
 */
public class 爬楼梯 {

    public int climbStairs(int n) {
        if(n <=2 ){
            return n;
        }
        int step1 = 1;
        int step2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = step1;
            step1 = step2;
            step2 = temp + step2;
        }
        return step2;
    }

}
