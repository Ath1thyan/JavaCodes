package LinkedList;

public class LogicClass {
    private Node head;
    private Node tail;
    private int size;

    public LogicClass(){
        this.size = 0;
    }

    // Insert element first to the list
    public void insertFirst(int value){
        Node node = new Node(value, head);
        head = node; // Update the head to the new node
        if(tail==null){
            tail=head;
        }
        size +=1;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int val){
            this.value = val;
        }

        public Node(int val, Node nex){
            this.value = val;
            this.next = nex;
        }
    }
}
