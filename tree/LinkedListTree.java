package tree;

class Node{
    int data;
    Node left;
    Node right;
    private Node head;
    private Node tail;
    public Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;
        this.head=null;
        this.tail=null;
    }
    public void left(int data){
        Node num=new Node(data);
        if(head==null){
            head = tail = num;
            head.left=null;
            head.right=null;
        }
        else{
            tail.right = num;
            num.left = tail;
            tail = num;
            tail.right=null;
        }
    }

    public void right(int data){
        Node num=new Node(data);
        if(tail==null){
            tail = head = num;
            tail.left=null;
            tail.right=null;
        }
        else{
            head.left = num;
            num.right = tail;
            head = num;
            head.left=null;
        }
    }

    public void disp(){
        Node c = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(c != null) {  
            System.out.print(c.data + " ");  
            c = c.right;  
        }  
    }

}

public class LinkedListTree {
    public static void main(String[] args) {
        Node obj = new Node(10);
        obj.left = new Node(20);
        obj.right = new Node(30);
        obj.left.left = new Node(40);
        obj.left.right = new Node(50);
        obj.disp();
    }
}
