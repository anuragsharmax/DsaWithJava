package Tree;

import java.util.*;

public class BinaryTree {

    /*
    General Binary Tree

    Definition:
    - Each node can have at most two children (left and right)

    Important:
    - No ordering property (unlike BST)
    - Structure depends on how nodes are inserted
    - Values can be anywhere (no constraints)

    Example:
        10
       /  \
     50    2   ← valid (not BST, but valid Binary Tree)
    */

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    /*
    Populate Tree (Interactive Input)

    Idea:
    - User decides structure of tree
    - For each node:
        ask → create left?
        ask → create right?

    Important:
    - This is Depth First Construction
    - Each node is responsible for creating its children
    */

    public void populate(Scanner sc) {
        System.out.println("enter root value");
        int val = sc.nextInt();
        this.root = new Node(val);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {

        System.out.println("do you want left child of " + node.value);
        boolean left = sc.nextBoolean();

        if (left) {
            System.out.println("enter left child value:");
            int valLeft = sc.nextInt();

            node.left = new Node(valLeft);

            // recursively build left subtree
            populate(sc, node.left);
        }

        System.out.println("do you want right child of " + node.value);
        boolean right = sc.nextBoolean();

        if (right) {
            System.out.println("enter value of right child:");
            int valRight = sc.nextInt();

            node.right = new Node(valRight);

            // recursively build right subtree
            populate(sc, node.right);
        }
    }

    /*
    Pretty Display (Sideways Tree View)

    Idea:
    - Right subtree printed first → appears on top
    - Root printed in middle
    - Left subtree printed last → appears below

    This creates a rotated tree visualization

    Example:
            3
        1
            2

    Level parameter:
    - Represents depth of node
    - Used for indentation
    */

    public void prettyDisplay() {
        prettyDisplay(this.root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) return;

        // go to right subtree first
        prettyDisplay(node.right, level + 1);

        // print current node with indentation
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.value);
        } else {
            System.out.println(node.value);
        }

        // go to left subtree
        prettyDisplay(node.left, level + 1);
    }

    /*
    Important Concepts to Remember

    1. This is NOT a BST
       - No ordering rule
       - Left can be greater than root

    2. Tree Construction Type
       - Depth First (recursive)
       - User-controlled structure

    3. Recursion Flow
       - Node → Left → Right
       - Each recursive call builds a subtree

    4. Base Case
       - When user chooses false → recursion stops naturally

    5. Use Case
       - Understanding tree structure
       - Learning recursion on trees
       - Visualizing tree shape
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        tree.populate(sc);

        System.out.println("\nTree Structure:");
        tree.prettyDisplay();

        sc.close();
    }
}