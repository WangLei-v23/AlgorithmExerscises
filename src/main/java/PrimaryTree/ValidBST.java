package PrimaryTree;

import java.util.ArrayList;

/**
 * description: ValidBST
 * date: 2020/8/2 21:45
 * package PrimaryTree
 * author: WangLei
 * version: 1.0
 */
public class ValidBST {

    ArrayList addTree = new ArrayList();

    /**
     * @Author: WangLei
     * @Description: 中序遍历二叉树
     * @Date: 15:12 2020/10/7
     * @Param: [head]
     * @return: int[]
     **/
    public void midOrderBiTree(TreeNode head) {
        if (head == null) {
            System.out.println("null tree!");
        } else {
            if (head.left != null) {
                midOrderBiTree(head.left);
            }
            addTree.add(head.val);
            System.out.print(head.val+" ");
            if (head.right != null) {
                midOrderBiTree(head.right);
            }
        }
    }


    /**
     * @Author: WangLei
     * @Description: 验证二叉搜索树
     * @Date: 15:25 2020/10/7
     * @Param: [root]
     * @return: boolean
     **/
    public boolean isValidBST() {
        ArrayList tesTree = addTree;
        boolean b = true;
        if (tesTree.size()<2){
            return true;
        }
        for (int i = 1; i < tesTree.size(); i++) {
            Integer.parseInt(String.valueOf(tesTree.get(i - 1)));
          if (Integer.parseInt(String.valueOf(tesTree.get(i - 1)))
                  >Integer.parseInt(String.valueOf(tesTree.get(i)))){
              b=false;
          }
        }
        return b;
    }

    public static void main(String[] args) {


        TreeNode treeNode1 = new TreeNode(20);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(28);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(10);
        TreeNode treeNode6 = new TreeNode(25);
        TreeNode treeNode7 = new TreeNode(29);

        //二叉搜索树的特性 ： 左节点 < 中节点 < 右节点
        //恰好符合二叉树中序遍历的特点 所以中序遍历后 对得到的结果进行顺序校验即可
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        ValidBST validBST = new ValidBST();
        validBST.midOrderBiTree(treeNode1);
        boolean bst = validBST.isValidBST();
        System.out.println("validBST==" + bst);
    }
}
