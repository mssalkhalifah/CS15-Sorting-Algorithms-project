public class Heap {
    private final int ROOT;
    private int size;
    private int[] arr;

    /**
     * Initializes the array for the heap.
     * @param size The total size of the heap.
     */
    public Heap(int size) {
        this.ROOT = 0;
        this.size = size;
        this.arr = new int[size];
    }

    /**
     * Returns the root of the heap tree.
     * @return The root of the tree.
     */
    public int getMin() {
        return arr[ROOT];
    }
}
