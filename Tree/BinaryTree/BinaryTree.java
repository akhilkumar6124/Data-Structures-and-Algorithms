public class BinaryTree{
    public static class TreeNode{
        char data;
        TreeNode left;
        TreeNode right;
        public TreeNode(char data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static TreeNode createNewNode(char data){
        return new TreeNode(data);
    }
    public static void main(String[] args){
        TreeNode root = createNewNode('R');
        TreeNode nodeA = createNewNode('A');
        TreeNode nodeB = createNewNode('B');
        root.left = nodeA;
        root.right = nodeB;
        TreeNode nodeC = createNewNode('C');
        TreeNode nodeD = createNewNode('D');
        TreeNode nodeE = createNewNode('E');
        TreeNode nodeF = createNewNode('F');
        nodeA.left = nodeC;
        nodeA.right = nodeD;
        nodeB.left = nodeE;
        nodeB.right = nodeF;
        System.out.println("root.left.left.data : "+root.left.left.data);
    }
}