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
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(16);
        root.left.left.left = new TreeNode(21);
        root.left.left.right = new TreeNode(19);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(1);
        root.right.left = new TreeNode(7);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);

        // Perform in-order traversal and print data
        System.out.println("In-order traversal:");
        inOrderTraversal(root);
    }

    // In-order traversal logic
    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }
}
