import java.util.LinkedList;
import java.util.Queue;

/**
 * Luxsan Indran
 * 221298286
 * luxsan@my.yorku.ca
 * Implementation of a Binary Search Tree with insert, search,
 * delete, and traversal operations.
 * @param <T> type stored in the tree
 */
public class MyBinarySearchTree<T extends Comparable<T>> {

    private TreeNode<T> root;

    public MyBinarySearchTree() {
        this.root = null;
    }

    /**
     * Inserts a value into the BST.
     * @param value value to insert
     */
    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private TreeNode<T> insertRecursive(TreeNode<T> node, T value) {
        if (node == null) {
            return new TreeNode<>(value);
        }
        if (value.compareTo(node.value) < 0) {
            node.left = insertRecursive(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = insertRecursive(node.right, value);
        }
        return node;
    }

    /**
     * Searches for a value in the BST.
     * @param value value to search
     * @return true if found, false otherwise
     */
    public boolean search(T value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(TreeNode<T> node, T value) {
        if (node == null) {
            return false;
        }
        if (value.compareTo(node.value) == 0) {
            return true;
        }
        if (value.compareTo(node.value) < 0) {
            return searchRecursive(node.left, value);
        }
        return searchRecursive(node.right, value);
    }

    /**
     * Deletes a value from the BST.
     * @param value value to delete
     */
    public void delete(T value) {
        root = deleteRecursive(root, value);
    }

    private TreeNode<T> deleteRecursive(TreeNode<T> node, T value) {
        if (node == null) {
            return null;
        }

        if (value.compareTo(node.value) < 0) {
            node.left = deleteRecursive(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = deleteRecursive(node.right, value);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            TreeNode<T> minNode = findMin(node.right);
            node.value = minNode.value;
            node.right = deleteRecursive(node.right, minNode.value);
        }

        return node;
    }

    private TreeNode<T> findMin(TreeNode<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    /**
     * Performs an in-order traversal of the BST.
     */
    public void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(TreeNode<T> node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    /**
     * Performs a pre-order traversal of the BST.
     */
    public void preOrderTraversal() {
        preOrder(root);
    }

    private void preOrder(TreeNode<T> node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * Performs a post-order traversal of the BST.
     */
    public void postOrderTraversal() {
        postOrder(root);
    }

    private void postOrder(TreeNode<T> node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    /**
     * Performs a level-order (BFS) traversal of the BST.
     */
    public void levelOrderTraversal() {
        if (root == null) return;

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.poll();
            System.out.print(current.value + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
}
