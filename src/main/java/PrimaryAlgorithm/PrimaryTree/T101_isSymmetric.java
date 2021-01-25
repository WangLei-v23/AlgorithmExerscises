package PrimaryAlgorithm.PrimaryTree;

/**
 * @Classname: test
 * @Description: //
 * @Author: w.lei.wang
 * @Date: 2020/10/9 17:55
 * @Version: V1.0
 */
public class T101_isSymmetric {


    /**
     * @Author: WangLei
     * @Description:  以返回值形式进入递归点
     * @Date: 23:59 2020/10/18
     * @Param: [root]
     * @return: boolean
     **/
    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        return isSymmetric(root.left,root.right);
    }
    /**
     * @Author: WangLei
     * @Description:  进入递归点，比较左右子树对称位置下的孩子结点
     * @Date: 0:00 2020/10/19
     * @Param: [t1, t2]
     * @return: boolean
     **/
    private boolean isSymmetric(TreeNode t1,TreeNode t2){
        if (t1==null&&t2==null) return true;
        if (t1==null||t2==null)return false;
//        if (t1.val!=t2.val)return false;
//        return isSymmetric(t1.left,t2.right)&&isSymmetric(t1.right,t2.left);
        if (t1.val==t2.val){
            return isSymmetric(t1.left,t2.right)&&isSymmetric(t1.right,t2.left);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        /**
         * 思路1： 分别遍历左右子树，对结果集进行对比。
         * 根据观察，有两种对比思路
         * 1.前序遍历左子树=reverse的后序遍历右子树
         * 2.中序遍历的左子树=中心旋转后的右子树
         *
         * 结果：舍弃
         * 原因：无法处理位置不同时，左右子树的值完全相等的情况，
         **/


        /**
         *思路2：递归比较，左树的左孩子=右树的右孩子，左树的右孩子=右树的左孩子
         * 优化：提取false条件进行判断
         **/

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        T101_isSymmetric t101 = new T101_isSymmetric();
        boolean symmetric = t101.isSymmetric(node1);
        System.out.println(symmetric);


    }


    //思路1：舍弃
    //    ArrayList<Integer> nodeRignt=new ArrayList<>();
//    ArrayList<Integer> nodeLeft=new ArrayList<>();
//
//    /**
//     * @Author: WangLei
//     * @Description:  获取左子树中序遍历结果
//     * @Date: 23:09 2020/10/18
//     * @Param: [headLeft]
//     * @return: void
//     **/
//    public void midOrderLeft(TreeNode headLeft){
//        if (headLeft.left!=null){
//            midOrderLeft(headLeft.left);   //递归遍历左子树
//        }
//        nodeLeft.add(headLeft.val);
//        if (headLeft.right!=null){
//            midOrderLeft(headLeft.right);  //递归遍历右子树
//        }
//    }
//
//
//    /**
//     * @Author: WangLei
//     * @Description:  获取右子树中序遍历结果
//     * @Date: 23:10 2020/10/18
//     * @Param: [headRight]
//     * @return: void
//     **/
//    public void midOrderRight(TreeNode headRight){
//        if (headRight.left!=null){
//            midOrderRight(headRight.left);   //递归遍历左子树
//        }
//        nodeRignt.add(headRight.val);
//        if (headRight.right!=null){
//            midOrderRight(headRight.right);  //递归遍历右子树
//        }
//    }
//
//    /**
//     * @Author: WangLei
//     * @Description:  中心旋转数组
//     * @Date: 22:18 2020/10/18
//     * @Param: [node]
//     * @return: int[]
//     **/
//    public ArrayList<Integer>  reverse(ArrayList<Integer> node){
//        ArrayList<Integer> reverse=node;
//        int i;
//        int j;
//        if (reverse.size()%2==0){
//            i=reverse.size()/2-1;
//            j=reverse.size()/2;
//        }else {
//            i=reverse.size()/2;
//            j=i;
//        }
//
//        for (;j<reverse.size();j++){
//            if (j==i){
//                i--;
//                continue;
//            }
//            int temp=reverse.get(i);
//            reverse.set(i,reverse.get(j));
//            reverse.set(j,temp);
//            i--;
//        }
//        return reverse;
//    }
//
//
//
//    /**
//     * @Author: WangLei
//     * @Description:  校验对称二叉树
//     * @Date: 23:20 2020/10/18
//     * @Param: [root]
//     * @return: boolean
//     **/
//    public boolean isSymmetric(TreeNode root) {
//        if (root==null){
//            return false;
//        }else {
//            midOrderLeft(root.left);
//            System.out.println("left="+nodeLeft);
//            midOrderRight(root.right);
//            System.out.println("right="+nodeRignt);
//            ArrayList<Integer> temp=reverse(nodeRignt);
//            System.out.println("temp="+temp);
//            if (nodeLeft.size()!=temp.size()){
//                return false;
//            }else {
//                for (int i=0;i<nodeLeft.size();i++){
//                    if (nodeLeft.get(i)!=temp.get(i)){
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
//    }
}
