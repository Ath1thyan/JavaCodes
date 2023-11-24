package tree;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class LinkedListNode {
    int data;
    LinkedListNode left;
    LinkedListNode right;

    public LinkedListNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class LinkedListTree1 {
    public static void main(String[] args) {
        TreeNode obj = new TreeNode(10);
        obj.right = new TreeNode(20);
        obj.right.right = new TreeNode(30);
        obj.right.left = new TreeNode(40);
        obj.right.right.left = new TreeNode(50);
        obj.right.right.right = new TreeNode(60);
        disp(obj);
    }

    public static void disp(TreeNode head) {
        if (head != null) {
            disp(head.left);
            System.out.println(head.data + " ");
            disp(head.right);
        }
    }
}
