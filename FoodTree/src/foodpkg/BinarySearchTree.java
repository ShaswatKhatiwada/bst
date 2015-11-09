/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodpkg;

/**
 *
 * @author Pradip
 */
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Generic binary search implementation. Must create comparator
 *
 * @author Pradip
 * @param <T>
 */
public class BinarySearchTree<T> {

    private Node<T> root = null;
    private Comparator<T> comp = null;

    /**
     *
     * @param comparator
     */
    public BinarySearchTree(Comparator<T> comparator) {
        comp = comparator;
    }

    /**
     *
     * @param value
     */
    public void insert(T value) {
        if (root != null) {
            insert(root, value);
        } else {
            root = new Node<T>(value);
        }
    }

    private void insert(Node<T> n, T value) {
        int compResult = comp.compare(n.values.get(0), value);
        if (compResult < 0) {
            if (n.left == null) {
                n.left = new Node<T>(value);
            } else {
                insert(n.left, value);
            }
        } else if (compResult > 0) {
            if (n.right == null) {
                n.right = new Node<T>(value);
            } else {
                insert(n.right, value);
            }
        } else { // value.equals(n.values.get(0))
            n.values.add(value);
        }
    }

    /**
     *
     * @param value
     * @return
     */
    public boolean remove(T value) {
        if (root != null) {
            return remove(root, value);
        } else {
            return false;
        }
    }

    private boolean remove(Node<T> n, T value) {
        if (n.values.get(0).equals(value)) {
            n.values.remove(0);

            // TODO remove node if n.values.size == 0
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param value
     * @return
     */
    public boolean find(T value) {
        if (value == null) {
            return false;
        }
        return find(value, root);
    }

    private boolean find(T value, Node n) {
        if (n == null) {
            return false;
        }
        if (n.values.get(0).equals(value)) {
            return true;
        }
        return n.values.get(0).equals(value)
                || find(value, n.left)
                || find(value, n.right);
    }

    /**
     *
     */
    public void print() {
        if (root != null) {
            print(root);
            System.out.println();
        } else {
            System.out.println("Empty BST");
        }
    }

    private void print(Node<T> n) {
        if (n == null) {
            return;
        }
        print(n.left);
        System.out.print(n.toString());
        print(n.right);
    }

    /**
     * Private Node class. Entity to insert in BST.
     *
     * @param <T2>
     */
    class Node<T2> {

        public Node<T2> left;
        public Node<T2> right;
        public List<T2> values;

        public Node(T2 value) {
            this(null, null, value);
        }

        public Node(Node<T2> left, Node<T2> right, T2 value) {
            this.left = left;
            this.right = right;
            this.values = new LinkedList<T2>();
            values.add(value);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (T2 item : values) {
                sb.append(item);
                sb.append(", ");
            }
            sb.append("\n");
            return sb.toString();
        }
    }
}
