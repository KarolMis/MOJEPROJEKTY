package lekcja29;

public class Pair<T,V> {
    private T one;
    private V two;

    public Pair(T one, V two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public V getTwo() {
        return two;
    }

    public void setTwo(V two) {
        this.two = two;
    }
}
