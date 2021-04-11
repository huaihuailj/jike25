package com.study.secondweek;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class 二叉树的前序遍历 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root,result);
        return result;
    }

    private void inOrder(TreeNode node, List<Integer> resultList){
        if(node == null){
            return;
        }
        resultList.add(node.val);
        inOrder(node.left,resultList);
        inOrder(node.right,resultList);
    }

}
