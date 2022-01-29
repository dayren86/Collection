package lists;

import java.util.Arrays;

public abstract class List {
    private Object[] data = new Object[8];
    private int index = 0;

    public Object getData(int index) {
        return data[index];
    }

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

    public void clear() {
        Object[] data = {};
        System.out.println("arrayList.clear = " + Arrays.toString(data));
    }

    public int size() {
        return data.length;
    }

    public Object get(int index) {
        return data[index];
    }
}
