package lists;

public class StackList extends List{

    public Object peek() {
        return getData(size() - 1);
    }

    public Object poll() {
        Object temp = peek();
        remove(size() - 1);
        return temp;
    }


}
