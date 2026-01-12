public class postOrderTraversal{
    public static  class TreeNode{
        String data;
        TreeNode left;
        TreeNode right;
        public TreeNode(String data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void PostOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.data+", ");
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode("R");
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        root.left = nodeA;
        root.right = nodeB;
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        nodeA.left = nodeC;
        nodeA.right = nodeD;
        nodeB.left = nodeE;
        nodeB.right = nodeF;
        PostOrderTraversal(root);
    }
}