public class BinarySearchTree{
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static TreeNode search(TreeNode node, int target) {
        if (node == null) {
            return null;
        } else if (node.data == target) {
            return node;
        } else if (target < node.data) {
            return search(node.left, target);
        } else {
            return search(node.right, target);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(21);
        root.left = new TreeNode(18);
        root.right = new TreeNode(29);
        root.left.left = new TreeNode(17);
        root.left.right = new TreeNode(20);
        root.right.left = new TreeNode(27);
        root.right.right = new TreeNode(38);
        root.right.left.right = new TreeNode(28);
        root.right.right.right = new TreeNode(79);
        TreeNode result = search(root, 28);
        if (result != null) {
            System.out.println("Found the node with value: " + result.data);
        } else {
            System.out.println("Value not found in the BST.");
        }
    }
}
