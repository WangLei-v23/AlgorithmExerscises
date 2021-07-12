package SouthWind.s023_024;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("h", "Hello");
        hashMap.put("w", "World");
        hashMap.put("j", "Java");
        hashMap.put("s", "JavaSE");
        hashMap.put("m", "JavaME");
        hashMap.put("e", "JavaEE");
//        hashMap.put("j", "Jack"); //直接覆盖key值相同的value
        System.out.println(hashMap);
        System.out.println("*********************************");
        /**
         * map的3种遍历方式
         */
        //1、获取set 使用迭代器遍历
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"-----"+next.getValue());
        }
        System.out.println("*********************************");
        //2、获取key所在的set集合 使用迭代器遍历
        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator1 = keySet.iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
            System.out.println(next);
        }
        System.out.println("*********************************");
        //3、获取value所在的Collection集合 使用迭代器遍历
        Collection<String> values = hashMap.values();
        Iterator<String> iterator2 = values.iterator();
        while (iterator2.hasNext()){
            String next = iterator2.next();
            System.out.println(next);
        }
    }
    /**
     * put方法详解
     * @param hash
     * @param key
     * @param value
     * @param onlyIfAbsent
     * @param evict
     * @return V
     */
    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; //哈希桶
        Node<K,V> p;//待存入节点
        int n, i;//哈希桶长度
        //判断是否需要初始化数组 先初始化数组长度
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        //如果数组已经初始化 判断根据容量与运算hash得到的下标位置是否存在元素
        if ((p = tab[i = (n - 1) & hash]) == null)//该下标位置不存在元素
            tab[i] = newNode(hash, key, value, null);//直接将元素插入桶
        else {//该下标位置不存在元素 将元素转换为node 插入链表/树中
            Node<K,V> e; K k;
            if (p.hash == hash &&//hash冲突
                    ((k = p.key) == key || (key != null && key.equals(k))))//与已存在的node key相同 value不同
                e = p;//直接用待插入元素替换该node
            else if (p instanceof TreeNode)//如果链表已经树化
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);//将元素存入红黑树中
            else {//如果链表未树化
                for (int binCount = 0; ; ++binCount) {//遍历链表
                    if ((e = p.next) == null) {//优先处理链表尾部 移动指针e
                        p.next = newNode(hash, key, value, null);//将元素插入链表尾部
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st  判断插入元素后的链表长度是否达到树化临界值
                            treeifyBin(tab, hash);//达到临界值 树化
                        // （函数中还存在另一层哈希桶长度>64的临界值 哈希桶<64时，使用扩容代替树化）
                        //能用数组尽量用数组，因为数组查询效率更高，能够使hashmap的查询接近O(1)
                        break;
                    }
                    if (e.hash == hash &&//遍历时遇到key相同 且 value相同的节点
                            ((k = e.key) == key || (key != null && key.equals(k))))
                        break;//完全相同 不做处理 跳出判断
                    //其实就是移动指针p 继续遍历
                    p = e;//基于上一个if条件中的e = p.next 此行代码相当于p.next
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;//如果存在相同的key值
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;//覆盖key值相同node的value
                afterNodeAccess(e);
                return oldValue; //返回被覆盖的 value
            }
        }
        ++modCount;//增加变动次数
        if (++size > threshold)//判断存入后的哈希桶是否需要扩容 threshold=capacity* loadFactor=16*0.75=12
            resize();//扩容操作
        afterNodeInsertion(evict);
        //如果 key 不重复，则返回 null
        return null;
    }





    class V{}
    class K{}
    class Node<K,V> {
        final int hash=0;
        final K key=null;
        V value;
        Node<K,V> next;
        final TreeNode<K,V> putTreeVal(HashMapTest map, Node<K,V>[] tab, int h, K k, V v){return null;}
    }
    class TreeNode<K,V> extends Node<K,V>{
        TreeNode<K,V> parent;  // red-black tree links
        TreeNode<K,V> left;
        TreeNode<K,V> right;
        TreeNode<K,V> prev;    // needed to unlink next upon deletion
        boolean red;
    }
    Node<K,V>[] table;
    public  Node<K,V>[] resize(){return null;}
    public Node<K,V> newNode(int hash, K key, V value, Node<K,V> next) {
        return null;
    }
    public static final int TREEIFY_THRESHOLD=0;
    final void treeifyBin(Node<K,V>[] tab, int hash) {}
    void afterNodeAccess(Node<K,V> p) { }
    void afterNodeInsertion(boolean evict) { }
    transient int modCount;
    int threshold;
    transient int size;



}