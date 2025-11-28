/**
 * Luxsan Indran
 * 221298286
 * luxsan@my.yorku.ca
 * Tree node for the Binary Search Tree.
 * @param <T> type stored in the node
 */
public class TreeNode<T extends Comparable<T>> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
