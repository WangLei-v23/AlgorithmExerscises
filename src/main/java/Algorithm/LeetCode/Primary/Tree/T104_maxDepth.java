package Algorithm.LeetCode.Primary.Tree;

public class T104_maxDepth {

    /**
    * @Author: WangLei
    * @Description: //TODO 递归解法
    * @Date: 21:18 2020/8/2
    * @Param: [] 
    * @return: int
    **/
    public  int maxDepth(TreeNode root){
        //判断边界  若为空树 深度为0
        if (root==null) return 0;
        //递归左子树
        int left = maxDepth(root.left);
        //递归右子树
        int right = maxDepth(root.right);
        //返回最大深度+1（根）
        return Math.max(left,right )+1;
    }

    /**
    * @Author: WangLei
    * @Description: //TODO 对递归算法进行内存优化
    * @Date: 21:29 2020/8/2
    * @Param: [root]
    * @return: int
    **/
    public  int maxDepthPlus(TreeNode root){
        //判断边界  若为空树 深度为0
        if (root==null) return 0;
        //返回最大深度+1（根）
        return Math.max(maxDepthPlus(root.left),maxDepthPlus(root.right))+1;
    }



    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode2.left=null;
        treeNode2.right=null;
        treeNode3.left=treeNode4;
        treeNode3.right=treeNode5;

        T104_maxDepth maxDeepOfTree = new T104_maxDepth();
        int i = maxDeepOfTree.maxDepth(treeNode1);
        System.out.println("maxdeep="+i);
    }
}
