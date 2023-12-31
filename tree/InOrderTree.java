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

public class InOrderTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(19);
        root.left = new TreeNode(17);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(39);
        root.left.right.right = new TreeNode(32);
        root.left.left.left = new TreeNode(33);
        root.left.left.right = new TreeNode(31);
        root.left.left.right.left = new TreeNode(9);
        root.left.left.left.left =new TreeNode(5);
        root.left.left.left.right =new TreeNode(29);
        root.right = new TreeNode(22);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(8);
        root.right.right.left = new TreeNode(16);
        root.right.right.right = new TreeNode(12);
        root.right.right.left.left =new TreeNode(13);
        root.right.right.left.right = new TreeNode(14);
        root.right.right.left.right.right = new TreeNode(1);
        root.right.right.left.right.right.right = new TreeNode(3);


        System.out.println("In-order traversal:");
        inOrderTraversal(root);
        System.out.println();
    }


    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }
    
}
