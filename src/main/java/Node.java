public class Node {
    private int Data;//数据域
    private Node Next;//指针域

    public Node(int Data){
        this.Data= Data;
    }
    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }


}
