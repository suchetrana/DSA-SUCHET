

public class TreeMaxExample {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    int findMax(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        TreeMaxExample tree = new TreeMaxExample();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.right = new TreeNode(60);

        System.out.print("Preorder Traversal: ");
        tree.preOrder(root);
        System.out.println();

        int maxValue = tree.findMax(root);
        System.out.println("Maximum value in the tree: " + maxValue);
    }
}
