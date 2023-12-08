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

    public int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int depthLeft = maxDepth(node.left);
            int depthRight = maxDepth(node.right);
            return Math.max(depthLeft, depthRight) + 1;
        }
    }
}

public class TreeDepth {
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

        
        int treeDepth = root.maxDepth(root); // Call maxDepth method from an instance
        System.out.println("Height of tree is " + treeDepth);
    }

    
}