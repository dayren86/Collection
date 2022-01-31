package lists;

import java.util.Arrays;

public class MyArrayList<V> implements MyList<V> {
    private Object[] data = new Object[8];
    private int index = 0;

    @Override
    public void addLast(V value) {
        if (index == data.length - 1) {
            Object[] newData =  new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[index] = value;
        index++;
        System.out.println(Arrays.toString(data));
    }

    @Override
    public void remove(int indexRemove) {
        data[indexRemove] = null;
        Object[] newData = new Object[data.length];
        int indexNewData = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                newData[indexNewData] = data[i];
                indexNewData++;
            }
        }
        data = newData;
        index--;

        System.out.println("arrayList.remove = " + Arrays.toString(data));
    }

    @Override
    public void clear() {
        data = new Object[8];
        System.out.println("arrayList.clear = " + Arrays.toString(data));
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public V get(int index) {
        return (V) data[index];
    }

    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        for (int i = 1; i < 5; i++) {
            arrayList.addLast("i" + i);
        }
        arrayList.remove(3);
        System.out.println("arrayList.get(4) = " + arrayList.get(4));
        System.out.println("arrayList.size() = " + arrayList.size());
    }

}
