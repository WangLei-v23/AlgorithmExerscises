package PrimaryTree;

/**
 * description: OrderBinaryTree
 * date: 2020/8/9 13:40
 * package PrimaryTree
 * author: WangLei
 * version: 1.0
 */
public class OrderBinaryTree {

    
    /**
    * @Author: WangLei
    * @Description: //TODO 递归 前序遍历二叉树
    * @Date: 13:51 2020/8/9
    * @Param: [head] 
    * @return: void
    **/


    public static void preOrderBiTree(TreeNode head){

        if (head==null) {   //若为空树  直接输出null
            System.out.println("null Tree");
        } else{
            System.out.print(head.val+" ");   //先输出根节点
            if (head.left!=null){
                preOrderBiTree(head.left);   //递归遍历左子树
            }
            if (head.right!=null){
                preOrderBiTree(head.right);  //递归遍历右子树
            }
        }
    }

    /**
    * @Author: WangLei
    * @Description: //TODO 递归  中序遍历二叉树
    * @Date: 14:05 2020/8/9
    * @Param: [head] 
    * @return: void
    **/
    public static void midOrderBiTree(TreeNode head){
        if (head==null) {   //若为空树  直接输出null
            System.out.println("null Tree");
        } else{

            if (head.left!=null){
                midOrderBiTree(head.left);   //递归遍历左子树
            }
            System.out.print(head.val+" ");   //输出根节点
            if (head.right!=null){
                midOrderBiTree(head.right);  //递归遍历右子树

            }



        }

    }

    /**
    * @Author: WangLei
    * @Description: //TODO 递归  后序遍历二叉树
    * @Date: 14:13 2020/8/9
    * @Param: [head]
    * @return: void
    **/
    public static void postOrderBiTree(TreeNode head){
        if (head==null) {   //若为空树  直接输出null
            System.out.println("null Tree");
        } else{

            if (head.left!=null){
                postOrderBiTree(head.left);   //递归遍历左子树
            }
           if (head.right!=null){
               postOrderBiTree(head.right);  //递归遍历右子树
           }

            System.out.print(head.val+" ");   //输出根节点

        }

    }


    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode2.left=treeNode4;
        treeNode3.right=treeNode5;
        treeNode4.right=treeNode6;
        treeNode6.right=treeNode7;

        preOrderBiTree(treeNode1);
        System.out.println();
        midOrderBiTree(treeNode1);
        System.out.println();
        postOrderBiTree(treeNode1);
        
    }
}
