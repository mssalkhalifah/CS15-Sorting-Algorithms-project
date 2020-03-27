package heap;

public class HNode<T> {
    private int key;
    private T value;
    private HNode<T> left;
    private HNode<T> right;
    private HNode<T> parent;
    private int x;
    private int y;

    public HNode() {
    }

    public HNode(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeft(HNode<T> left) {
        this.left = left;
    }

    public void setRight(HNode<T> right) {
        this.right = right;
    }

    public void setParent(HNode<T> parent) {
        this.parent = parent;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public HNode<T> getLeft() {
        return left;
    }

    public HNode<T> getRight() {
        return right;
    }

    public HNode<T> getParent() {
        return parent;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "HNode{" +
                "key=" + key +
                ", value=" + value +
                ", left=" + left +
                ", right=" + right +
                ", parent=" + parent +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
