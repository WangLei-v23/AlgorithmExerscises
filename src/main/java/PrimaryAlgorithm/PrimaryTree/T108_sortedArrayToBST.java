package PrimaryAlgorithm.PrimaryTree;

import java.util.List;

/**
 * @ClassName: T108
 * @Description:
 * @Author: WangLei
 * @Date: 2020/11/3 21:58
 */
public class T108_sortedArrayToBST {
    /**
     * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树
     * 在二叉搜索树中：
     * 1.若任意结点的左子树不空，则左子树上所有结点的值均不大于它的根结点的值。
     * 2. 若任意结点的右子树不空，则右子树上所有结点的值均不小于它的根结点的值。
     * 3.任意结点的左、右子树也分别为二叉搜索树。
     * 一个高度平衡二叉树是指一个二叉树每个节点左右两个子树的高度差的绝对值不超过 1
     *
     * 思路：二叉搜索树BST的中序遍历是升序的
     * 故，将数组以中序遍历的顺序建立一颗二叉树即可
     * 要求高度相差不超过1，所以
     * 递归条件：选择数组中间作为根节点
     * 递归结束条件：
     **/



    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(nums,0,nums.length-1);
    }

    public TreeNode BST(int[] nums,int low,int heigh){
        if (low>heigh) return null;
        //不能直接用mid=(heigh-low)/2  会在递归中得不到右子树的中间结点
        int mid=low+(heigh-low)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=BST(nums,low,mid-1);
        root.right=BST(nums,mid+1,heigh);
        return root;
    }



    public static void main(String[] args) {
        int data[]={1,2,3,4,5,6,7,8,9,10};
        T108_sortedArrayToBST t108 = new T108_sortedArrayToBST();
        TreeNode root = t108.sortedArrayToBST(data);
        T102_levelOrder t102LevelOrder = new T102_levelOrder();
        List<List<Integer>> lists = t102LevelOrder.levelOrder(root);
        System.out.println(lists.toString());


    }

}
