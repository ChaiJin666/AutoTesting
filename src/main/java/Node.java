public class Node {
    private int data;//数据域
    private Node next;//指针域

    public Node(int Data){

        this.data= Data;
    }
    public int getData() {

        return data;
    }

    public void setData(int data) {

        this.data = data;
    }

    public Node getNext() {

        return next;
    }

    public void setNext(Node next) {

        this.next = next;
    }



public static Node reverse(Node head){
    //如果是空链表或者尾结点
    if(head==null||head.getNext()==null){
        return head;
    }
    //先反转后续结点
    Node reversedHead=reverse(head.getNext());
    //当前结点指针指向前一结点
    head.getNext().setNext(head);
    //令前一结点的指针域为null
    head.setNext(null);
    return reversedHead;
}
}