package com.study.threeweek;

import java.util.ArrayList;
import java.util.List;

public class 括号生成 {

    /**
     * 左括号
     */
    private static  final String LEFT_CHAR = "(";

    /**
     * 右括号
     */
    private static  final String RIGHT_CHAR = ")";

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        if(n <= 0){
            return result;
        }
        generate(n,"",result,0,0);
        return result;
    }

    private void generate(int n,String currentStr,List<String> result,int leftTimes,int rightTimes) {

        if (currentStr.length() == 0) {
            //生成左括号
            generate(n, currentStr + "(", result, leftTimes + 1, rightTimes);
            return;
        }

        //如果是n*2的长度，则加入并返回
        if (currentStr.length() == n * 2) {
            result.add(currentStr);
            return;
        }

        if (leftTimes > n || rightTimes > leftTimes) {
            return;
        }

        if (leftTimes < n) {
            //生成左括号
            generate(n, currentStr + "(", result, leftTimes + 1, rightTimes);
        }

        if (rightTimes < n) {
            //生成右括号
            generate(n, currentStr + ")", result, leftTimes, rightTimes + 1);
        }
    }

}
