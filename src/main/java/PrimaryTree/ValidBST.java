package PrimaryTree;

/**
 * description: ValidBST
 * date: 2020/8/2 21:45
 * package PrimaryTree
 * author: WangLei
 * version: 1.0
 */
public class ValidBST {


    public boolean isValidBST(TreeNode root) {


        return false;
    }

    public static void main(String[] args) {


        TreeNode treeNode1 = new TreeNode(20);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(28);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(29);

        //二叉搜索树的特性 ： 左 < 中 < 右    恰好符合二叉树中序遍历的特点
        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode2.left=null;
        treeNode2.right=null;
        treeNode3.left=treeNode4;
        treeNode3.right=treeNode5;
        ValidBST validBST = new ValidBST();
        boolean bst = validBST.isValidBST(treeNode1);
        System.out.println("validBST=="+bst);
    }
}
