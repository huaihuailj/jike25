package com.study.secondweek;

import java.util.Arrays;

public class 最小的k个数 {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr,0,k);
    }

}
