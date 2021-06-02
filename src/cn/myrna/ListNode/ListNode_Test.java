package cn.myrna.ListNode;

public class ListNode_Test {
    public static void main(String[] args) {
        //创建数组
        int[] arr = new int[]{1,2,3,4,5,6,6,7,8,4,2,31,12,5};

        //新建链表对象再传入一个结点arr[0]
        ListNode listNode = new ListNode(arr[0]);

        //初始化变量i就不能写0了，因为添加节点按照下标来的
        //如果i=0的话，会再添加一个arr[0]的结点
        for (int i = 1 ; i < arr.length ; i++) {
            //根据数组下标循环添加结点
            listNode.add(arr[i]);
        }
        //打印
        listNode.print();
    }
}
