package tree.algorithm;

public class BST {

    TreeNode root;

    TreeNode insert(int key, TreeNode root) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        var current = root;

        while (current != null) {
            if (current.key == key) {
                System.out.println("KEY Already exists!");
                return current;
            } else if (current.key < key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        current = new TreeNode(key);
        return current;
    }

    int findMin(TreeNode root) {
        TreeNode min = root;
        while (min.left != null) {
            min = min.left;
        }
        return min.key;
    }

    int findMax(TreeNode root) {
        TreeNode max = root;
        while (max.right != null) {
            max = max.right;
        }
        return max.key;
    }

    TreeNode findSuccessor(TreeNode root, TreeNode node) {
        if (root == null) return null;
        // two cases -
        // 1. where immediate right child exists.
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
        // 2. where immediate right child DOES NOT exist.
        // it should not be a max node too -> handle the case separately
        TreeNode ancestor = null;
        TreeNode curr = root;
        while (node.key != curr.key) {
            if (node.key < curr.key) {
                ancestor = curr;
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return ancestor;
    }

    TreeNode findPredecessor(TreeNode root, TreeNode node) {
        if (root == null) return null;
        // two cases -
        // 1. where immediate left child exists.
        if (node.left != null) {
            node = node.left;
            while (node.right != null) {
                node = node.right;
            }
            return node;
        }
        // 2. where immediate left child DOES NOT exist.
        // it should not be a min node too -> handle the case separately
        TreeNode ancestor = null;
        TreeNode curr = root;
        while (node.key != curr.key) {
            if (node.key > curr.key) {
                ancestor = curr;
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        return ancestor;
    }

    TreeNode delete(TreeNode root, int key) {
        TreeNode curr = root;
        TreeNode prev = null;
        while (curr != null) {
            if (key == curr.key) {
                break;
            } else if (key < curr.key) {
                prev = curr;
                curr = curr.left;
            } else {
                prev = curr;
                curr = curr.right;
            }
        }
        if (curr == null) {
            return root;
        }

        // leaf node case
        if (curr.left == null && curr.right == null) {
            if (prev == null) {
                return null;
            }
            if (prev.left == curr) {
                prev.left = null;
            } else {
                prev.right = null;
            }
            return root;
        }

        // key node - has one child/child-tree
        TreeNode child = null;
        if (curr.left != null && curr.right == null) {
            child = curr.left;
            if (prev == null) {
                return child;
            }
            if (prev.left == curr) {
                prev.left = child;
            } else {
                prev.right = child;
            }
            return root;
        } else if (curr.left == null) {
            child = curr.right;
            if (prev == null) {
                return child;
            }
            if (prev.left == curr) {
                prev.left = child;
            } else {
                prev.right = child;
            }
            return root;
        }

        // key node - has both children
        // find successor and replace key node with it
        TreeNode successorNode = curr.right;
        prev = curr;
        while (successorNode.left != null) {
            prev = successorNode;
            successorNode = successorNode.left;
        }
        curr.key = successorNode.key;
        if (prev.left == successorNode) {
            prev.left = successorNode.right;
        } else { // successor is prev.right
            prev.right = successorNode.right;
        }

        return root;
    }

}

class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;

    public TreeNode(int key) {
        this.key = key;
    }
}
