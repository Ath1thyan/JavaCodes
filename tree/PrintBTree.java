package tree;

class Treenode {
	int data;
	Treenode left, right;

	Treenode(int data) {
		this.data = data;
		left = right = null;
	}
}

class Tree {
	Treenode root;

	Tree() {
		root = null;
	}
}

public class PrintBTree {

	public static int height(Treenode root) {
		if (root == null)
			return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	public static int getcol(int h) {
		if (h == 1)
			return 1;
		return getcol(h - 1) + getcol(h - 1) + 1;
	}

	public static void printTree(int[][] M, Treenode root, int col, int row, int height) {
		if (root == null)
			return;
		M[row][col] = root.data;
		printTree(M, root.left, col - (int)Math.pow(2, height - 2), row + 1, height - 1);
		printTree(M, root.right, col + (int)Math.pow(2, height - 2), row + 1, height - 1);
	}

	public static void TreePrinter(Tree tree) {
		int h = height(tree.root);
		int col = getcol(h);
		int[][] M = new int[h][col];
		printTree(M, tree.root, col / 2, 0, h);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < col; j++) {
				if (M[i][j] == 0)
					System.out.print(" ");
				else
					System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Tree myTree = new Tree();
		myTree.root = new Treenode(1);
		myTree.root.left = new Treenode(2);
		myTree.root.right = new Treenode(3);
		myTree.root.left.left = new Treenode(4);
		myTree.root.left.right = new Treenode(5);
		myTree.root.right.left = new Treenode(6);
		myTree.root.right.right = new Treenode(7);
		TreePrinter(myTree);
	}
}

