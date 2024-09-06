package LearningPath4.Course3;

import java.util.Scanner;

// Class representing a Node in the tree
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Class representing a Binary Tree
class BinaryTree {
    Node root;

    // Constructor for creating an empty tree
    public BinaryTree() {
        root = null;
    }

    // Task - Level 1: Method to display the tree (In-order Traversal)
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Task - Level 2: Insert a node into the binary tree
    public Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertNode(root.left, key);
        } else if (key > root.data) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    // Task - Level 3: Delete a node from the binary tree
    public Node deleteNode(Node root, int key) {
        if (root == null) return root;

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node to be deleted found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    // Helper function to find the minimum value node in the right subtree
    public int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
}

public class p4 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert a node into the tree");
            System.out.println("2. Delete a node from the tree");
            System.out.println("3. Display the tree (In-order traversal)");
            System.out.println("4. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    int insertValue = scanner.nextInt();
                    tree.root = tree.insertNode(tree.root, insertValue);
                    System.out.println("Node inserted.");
                    break;

                case 2:
                    System.out.print("Enter the value to delete: ");
                    int deleteValue = scanner.nextInt();
                    tree.root = tree.deleteNode(tree.root, deleteValue);
                    System.out.println("Node deleted.");
                    break;

                case 3:
                    System.out.println("In-order Traversal of the Tree:");
                    tree.inorderTraversal(tree.root);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
