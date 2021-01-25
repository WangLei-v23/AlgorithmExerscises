package PrimaryAlgorithm.PrimaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * description: ValidBST
 * date: 2020/8/2 21:45
 * package PrimaryTree
 * author: WangLei
 * version: 1.0
 */
public class T98_isValidBST {

    List<Integer> addTree = new ArrayList<>();
    /**
     * @Author: WangLei
     * @Description: 方法1：中序遍历二叉树得到遍历结果 再对结果进行验证
     * @Date: 15:12 2020/10/7
     * @Param: [head]
     * @return: int[]
     **/
    public void midOrderBiTree(TreeNode head) {
        if (head != null) {
            midOrderBiTree(head.left);
            addTree.add(head.val);
            System.out.print(head.val + " ");
            midOrderBiTree(head.right);
        }
    }
    /**
     * @Author: WangLei
     * @Description: 验证二叉搜索树结果集
     * @Date: 15:25 2020/10/7
     * @Param: [root]
     * @return: boolean
     **/
    public boolean isValidBST(TreeNode head) {
        if (head==null){
            return true;
        }
        //填充中序遍历结果
        midOrderBiTree(head);
        //验证结果集
        for (int i = 1; i < addTree.size(); i++) {
          if (addTree.get(i - 1)>=addTree.get(i)){
              return false;
          }
        }
        return true;
    }

    /**
     * @Author: WangLei
     * @Description:  方法2：中序遍历时，判断当前节点是否大于中序遍历的前一个节点即可
     * 妙啊！
     * @Date: 19:52 2020/10/7
     * @Param: [head]
     * @return: boolean
     **/
    long pre=Long.MIN_VALUE;
    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }
        //访问左子树
        if (isValidBST2(root.left)==false){
            return false;
        }
        //访问当前节点：如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；
        // 否则继续遍历
        if (root.val<=pre){
            return false;
        }
        System.out.print(root.val + " ");
        pre=root.val;
        //访问右子树
        return isValidBST2(root.right);
    }


    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(20);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(28);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(10);
        TreeNode treeNode6 = new TreeNode(25);
        TreeNode treeNode7 = new TreeNode(29);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        T98_isValidBST t98 = new T98_isValidBST();

        //方法1：二叉搜索树的特性 ： 左节点 < 中节点 < 右节点
        //恰好符合二叉树中序遍历的特点 所以中序遍历后 对得到的结果进行顺序校验即可
        boolean bst = t98.isValidBST(treeNode1);
        System.out.println("validBST==" + bst);
        System.out.println("---------------------------------------------");
        //方法2：中序遍历时，判断当前节点是否大于中序遍历的前一个节点
        //如果大于，说明满足 BST，继续遍历；否则直接返回 false
        boolean bst2= t98.isValidBST2(treeNode1);
        System.out.println("validBST2==" + bst2);


    }


}
