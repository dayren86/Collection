import lists.QueueList;
import lists.StackList;

public class StartTestCollection {
    public static void main(String[] args) {

        //TestQueueList
        QueueList queueList = new QueueList();
        for (int i = 0; i < 20; i++) {
            queueList.addLast(i + "f");
        }
        queueList.addLast("eee");

        int size = queueList.size();
        System.out.println("queueList.size = " + size);


        queueList.remove(1);

        queueList.clear();

        System.out.println("queueList.peek() = " + queueList.peek());
        queueList.poll();
        System.out.println("queueList.get(0) = " + queueList.get(0));

        queueList.addLast("eee");

        //TestStackList
        StackList stackList = new StackList();
        for (int i = 0; i < 20; i++) {
            stackList.addLast(i + "f");
        }
        stackList.addLast("eee");

        int size1 = stackList.size();
        System.out.println("arrayList.size = " + size1);


        stackList.remove(1);

        //stackList.clear();

        System.out.println("queueList.peek() = " + stackList.peek());
        stackList.poll();
        //System.out.println("queueList.get(0) = " + stackList.get(0));
        stackList.addLast("889");

    }
}
