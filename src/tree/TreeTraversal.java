package tree;

public class TreeTraversal {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);

        System.out.println("DFS Inorder traversal:");
        BinaryTreeNode.printInorder(root);
        System.out.println();
        BinaryTreeNode.printInorderIterative(root);
        System.out.println();

        System.out.println("DFS Preorder traversal:");
        BinaryTreeNode.printPreorder(root);
        System.out.println();
        BinaryTreeNode.printPreorderIterative(root);
        System.out.println();

        System.out.println("DFS Postorder traversal:");
        BinaryTreeNode.printPostorder(root);
        System.out.println();

        System.out.println("BFS traversal:");
        BinaryTreeNode.printBFS(root);
        System.out.println();
    }
}
