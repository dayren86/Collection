package lists;

public interface MyList<V> {
    void  addLast(V value);
    void remove(int indexRemove);
    void clear();
    int size();
    V get(int index);
}
