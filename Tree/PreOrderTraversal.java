public class PreOrderTraversal{
    public static class TreeNode{
        String data;
        TreeNode left;
        TreeNode right;
        public TreeNode(String data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preOrdertraversal(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.data+", ");
        preOrdertraversal(node.left);
        preOrdertraversal(node.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode("R");
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB =  new TreeNode("B");
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
        preOrdertraversal(root);
    }
}