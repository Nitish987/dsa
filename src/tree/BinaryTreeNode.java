package tree;

import java.util.*;

public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    BinaryTreeNode() {}

    BinaryTreeNode(int data) {
        this.data = data;
    }

    BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // DFS Traversal
    public static void printInorder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);

        System.out.print(root.data + "  ");

        printInorder(root.right);
    }

    // DFS Traversal Iterative
    public static void printInorderIterative(BinaryTreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = root;

        while (true) {
            if (node == null) {
                if (stack.isEmpty()) {
                    break;
                }

                node = stack.pop();
                inorder.add(node.data);
                node = node.right;
            } else {
                stack.push(node);
                node = node.left;
            }
        }

        printList(inorder);
    }

    // DFS Traversal
    public static void printPreorder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + "  ");

        printPreorder(root.left);

        printPreorder(root.right);
    }

    // DFS Traversal Iterative
    public static void printPreorderIterative(BinaryTreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();

        if (root == null) {
            return;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();

            preorder.add(node.data);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }

        printList(preorder);
    }

    // DFS Traversal
    public static void printPostorder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        printPostorder(root.left);

        printPostorder(root.right);

        System.out.print(root.data + "  ");
    }

    // BFS Traversal
    public static void printBFS(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if (root == null) {
            printWrapList(wrapList);
            return;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            List<Integer> levelList = new LinkedList<>();

            for (int i = 0; i < levelLength; i++) {
                BinaryTreeNode node = queue.peek();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                BinaryTreeNode previousNode = queue.poll();
                levelList.add(previousNode.data);
            }

            wrapList.add(levelList);
        }

        printWrapList(wrapList);
    }

    private static void printWrapList(List<List<Integer>> wrapList) {
        for (List<Integer> list : wrapList) {
            for (Integer element : list) {
                System.out.print(element + "  ");
            }
        }

        System.out.println();
    }

    private static void printList(List<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + "  ");
        }

        System.out.println();
    }
}
