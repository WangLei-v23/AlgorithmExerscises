package Algorithm.Primary.Tree;

import java.util.*;

/**
 * @ClassName: T102_levelOrder
 * @Description:
 * @Author: WangLei
 * @Date: 2020/10/21 21:52
 */
public class T102_levelOrder {

    List<List<Integer>> result=new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return result;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i <size ; i++) {
                TreeNode poll = queue.poll();
                if (poll.left!=null)queue.add(poll.left);
                if (poll.right!=null)queue.add(poll.right);
                list.add(poll.val);
            }
            result.add(list);
        }
        return result;
    }



    public static void main(String[] args) {
        /**
         *思路1：使用队列进行层序遍历
         *卡壳：如何分层
         *解决：父节点出队前，队列的长度即为下一层需要弹出的次数，
         *父节点全部弹出，即为一层
         *每次弹出父节点新增至list后，向队列中新增两个子结点
         **/
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
        TreeNode node7 = new TreeNode(4);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;

        T102_levelOrder t102LevelOrder = new T102_levelOrder();
        List<List<Integer>> lists = t102LevelOrder.levelOrder(node1);
        System.out.println(lists.toString());

    }
}
