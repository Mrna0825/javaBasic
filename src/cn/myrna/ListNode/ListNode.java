package cn.myrna.ListNode;
//创建一个链表的类
public class ListNode {
    int val;//数值 data
    ListNode next;//结点 node

    ListNode(int x){
        val = x;
    }

    ListNode(){}

    //添加新的结点
    public void add(int newval){
        ListNode newNode = new ListNode(newval);
        if(this.next == null){
            this.next = newNode;
        }else{
            this.next.add(newval);
        }


    }

    // 打印链表
    public void print(){
        System.out.print(this.val);
        if(this.next != null){
            System.out.print("-->");
            this.next.print();
        }
    }

}
