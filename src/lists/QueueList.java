package lists;

public class QueueList extends List{

    public Object peek() {
        return getData(0);
    }

    public Object poll() {
        Object temp = peek();
        remove(0);
        return temp;
    }


}
