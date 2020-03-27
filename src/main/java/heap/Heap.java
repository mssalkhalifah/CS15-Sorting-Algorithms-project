package heap;

public class Heap<T> {
    private HNode<T> root;
    private int size;

    /**
     * Gets the root of the heap.
     * @return Returns the root of the tree.
     */
    public HNode<T> getRoot() {
        return root;
    }

    /**
     * The upHeap process is used to add a node to a heap.
     * When you upHeap a node, you compare its value to its parent node;
     * if its value is less than its parent node, then you switch the two nodes and continue the process.
     * @param p The starting node of the upHeap process.
     */
    public void upHeap(HNode<T> p) {
        if (p != null && p.getParent() != null) {
            if (p.getKey() < p.getParent().getKey()) {
                swap(p, p.getParent());
                upHeap(p.getParent());
            } else {
                downHeap(p);
            }
        }
    }

    /**
     * The downHeap process is similar to the upHeap process. When you downHeap a node,
     * you compare its value with its two children. If the node is less than both of its children,
     * it remains in place; otherwise, if it is greater than one or both of its children,
     * then you switch it with the child of lowest value.
     * @param p The starting node of the downHeap process.
     */
    public void downHeap(HNode<T> p) {
        if (p != null) {
            if (p.getLeft() != null && p.getLeft().getKey() < p.getKey()) {
                if (p.getRight() == null) {
                    swap(p.getLeft(), p);
                    downHeap(p.getLeft());
                } else {
                    if (p.getLeft().getKey() < p.getRight().getKey()) {
                        swap(p.getLeft(), p);
                        downHeap(p.getLeft());
                    }
                }
            }

            if (p.getRight() != null && p.getRight().getKey() < p.getKey()) {
                if (p.getLeft() == null) {
                    swap(p.getRight(), p);
                    downHeap(p.getRight());
                } else {
                    if (p.getRight().getKey() < p.getLeft().getKey()) {
                        swap(p.getRight(), p);
                        downHeap(p.getRight());
                    }
                }
            }
        }
    }

    /**
     * Insert a key and a value into the heap.
     * @param k The key to insert.
     * @param v The value to insert with the key.
     * @return Returns the entry created.
     */
    public HNode<T> insert(int k, T v) {
        if (getRoot() != null) {
            int newSize = ++size;
            StringBuilder bits = new StringBuilder();
            while (newSize > 1) {
                bits.append(newSize % 2);
                newSize /= 2;
            }

            HNode<T> entry = getRoot();
            for (int i = bits.length() - 1; i >= 1; i--) {
                if (bits.charAt(i) == '0') {
                    entry = entry.getLeft();
                } else {
                    entry = entry.getRight();
                }
            }

            if (bits.charAt(0) == '0') {
                entry.setLeft(new HNode<>(k, v));
                entry.getLeft().setParent(entry);
            } else {
                entry.setRight(new HNode<>(k, v));
                entry.getRight().setParent(entry);
            }

            HNode<T> temp = entry;
            upHeap(entry);

            return temp;
        }

        root = new HNode<>(k, v);
        size++;
        return root;
    }

    /**
     * Gets the root of the heap without affecting the heap structure.
     * @return Returns the root of the heap.
     */
    public HNode<T> min() {
        return getRoot();
    }

    /**
     * Gets the root and remove it from the tree. Using upHeap and downHeap to keep the structure of the heap.
     * @return Returns the removed node.
     */
    public HNode<T> removeMin() {
        if (size == 1) {
            int removeKey = getRoot().getKey();
            T removeValue = getRoot().getValue();
            size--;
            root = null;
            return new HNode<>(removeKey, removeValue);
        }

        int removeKey = getRoot().getKey();
        T removeValue = getRoot().getValue();

        int newSize = size--;
        StringBuilder bits = new StringBuilder();
        while (newSize > 1) {
            bits.append(newSize % 2);
            newSize /= 2;
        }

        HNode<T> entry = getRoot();
        for (int i = bits.length() - 1; i >= 1; i--) {
            if (bits.charAt(i) == '0') {
                entry = entry.getLeft();
            } else {
                entry = entry.getRight();
            }
        }

        if (bits.charAt(0) == '0') {
            swap(entry.getLeft(), getRoot());
            entry.setLeft(null);
        } else {
            swap(entry.getRight(), getRoot());
            entry.setRight(null);
        }

        downHeap(getRoot());

        return new HNode<>(removeKey, removeValue);
    }

    /**
     * Gets the total size of the heap.
     * @return Returns the size of the heap.
     */
    public int size() {
        return size;
    }

    /**
     * Check if the heap is empty.
     * @return Returns true if the heap is empty, otherwise returns false.
     */
    public boolean isEmpty() {
        return (root == null);
    }

    private void swap(HNode<T> n1, HNode<T> n2) {
        int tempKey = n1.getKey();
        T tempValue = n1.getValue();
        n1.setKey(n2.getKey());
        n1.setValue(n2.getValue());
        n2.setKey(tempKey);
        n2.setValue(tempValue);
    }
}
