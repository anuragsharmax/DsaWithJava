package Tree;

public class BinarySearchTree {

    /*
    Binary Search Tree (BST)

    Core Property:
    For every node:
        left subtree values < node value < right subtree values

    Important points:
    - This property must hold for EVERY node (not just root)
    - Enables efficient searching (O(log N) if balanced)
    - Inorder traversal gives sorted output
    */

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BinarySearchTree(){}

    /*
    Height of a node

    Definition:
    Height = number of edges in longest path from node to leaf

    Convention used:
    - null node → height = -1
    - leaf node → height = 0

    Why?
    Makes height calculation consistent:
    height = max(left, right) + 1
    */

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    /*
    Check if tree is empty
    */

    public boolean isEmpty(){
        return root == null;
    }

    /*
    Insert into BST

    Idea:
    - Compare value with current node
    - Go left if smaller
    - Go right if larger
    - Insert at null position

    After insertion:
    - Update height while backtracking (important for balance checking)
    */

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            return new Node(value);
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    /*
    Check if tree is balanced

    Definition:
    For every node:
    |height(left) - height(right)| ≤ 1

    Note:
    - This only checks balance
    - It does NOT fix imbalance (not an AVL tree)
    */

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    /*
    Display tree (parent-child relation)

    Purpose:
    - Helps visualize structure logically
    - Not shape-based, but relation-based
    */

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) return;

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    /*
    Build balanced BST from sorted array

    Idea:
    - Always pick middle element as root
    - Left half → left subtree
    - Right half → right subtree

    Why it works:
    - Splits elements evenly → height becomes log N

    Range used:
    - Inclusive range [start, end]
    */

    public void sortedPopulate(int[] nums){
        sortedPopulate(nums, 0, nums.length - 1);
    }

    private void sortedPopulate(int[] nums, int start, int end){
        if(start > end){
            return;
        }

        int mid = start + (end - start) / 2;

        this.insert(nums[mid]);

        sortedPopulate(nums, start, mid - 1);
        sortedPopulate(nums, mid + 1, end);
    }

    /*
    Preorder Traversal

    Order:
    Root → Left → Right

    Meaning:
    - Process node first, then children

    Use cases:
    - Tree copying
    - Serialization
    */

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null) return;

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /*
    Inorder Traversal

    Order:
    Left → Root → Right

    Key insight:
    - In BST, this produces sorted output

    Why:
    left < root < right
    */

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    /*
    Postorder Traversal

    Order:
    Left → Right → Root

    Meaning:
    - Process children before parent

    Use cases:
    - Tree deletion
    - Bottom-up calculations (height, diameter)
    */

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        int[] arr = {1,2,3,4,5,6,7,8,9};
        bst.sortedPopulate(arr);

        System.out.println("tree structure: ");
        bst.display();

        System.out.println("Tree is balanced : " + bst.balanced());

        System.out.print("\npre-order traversal: ");
        bst.preOrder();

        System.out.print("\nin-order traversal: ");
        bst.inOrder();

        System.out.print("\npost-order traversal: ");
        bst.postOrder();
    }
}