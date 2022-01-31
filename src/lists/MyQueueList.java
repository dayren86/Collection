package lists;

import java.util.Arrays;

public class MyQueueList<V> implements MyList<V> {
    private Object[] data = new Object[8];
    private int index = 0;

    @Override
    public void addLast(Object value) {
        if (index == data.length - 1) {
            Object[] newData = new Object[data.length * 2];
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

    public V peek() {
        return (V) data[0];
    }

    public V poll() {
        V temp = peek();
        remove(0);
        return temp;
    }

    public static void main(String[] args) {
       MyQueueList<String> queueList = new MyQueueList<>();
        for (int i = 0; i < 20; i++) {
            queueList.addLast(i + "f");
        }
        queueList.addLast("eee");

        int size = queueList.size();
        System.out.println("queueList.size = " + size);


        queueList.remove(1);

        System.out.println("queueList.peek() = " + queueList.peek());
        queueList.poll();
        System.out.println("queueList.get(0) = " + queueList.get(0));

        queueList.addLast("eee");
    }
}
