package com.study.secondweek;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的中序遍历 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root,result);
        return result;
    }

    private void inOrder(TreeNode node, List<Integer> resultList){
        if(node == null){
            return;
        }
        inOrder(node.left,resultList);
        resultList.add(node.val);
        inOrder(node.right,resultList);
    }

}
