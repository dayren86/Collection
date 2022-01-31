package linkedList;

public class LinkedList <E> {

    private NodeLinkedList<E> headNode;

    public void add(E item) {
        if (headNode == null) {
            headNode = new NodeLinkedList<>(item);
        } else {
            NodeLinkedList<E> findLastNode = headNode;
            while (findLastNode.getNextNode() != null) {
                findLastNode = findLastNode.getNextNode();
            }
            NodeLinkedList<E> newNode = new NodeLinkedList<>(item);
            findLastNode.setNextNode(newNode);
            newNode.setPrevNode(findLastNode);
        }
    }


    public void remove(E valueNode) {
        if (headNode == null) {
            System.out.println("List empty");
        }
        if (headNode.getValueNode() == valueNode) {
            headNode.getNextNode().setPrevNode(null);
            headNode = headNode.getNextNode();
        } else {
            NodeLinkedList<E> findPrevNode = searchPrevNode(headNode, valueNode);
            NodeLinkedList<E> searchPrev = findPrevNode.getNextNode().getNextNode();
            headNode.setNextNode(searchPrev);
            searchPrev.setPrevNode(headNode);
        }
    }

    public NodeLinkedList<E> searchPrevNode(NodeLinkedList<E> findNode, E valueNode) {
        while (findNode.getNextNode() != null) {
            if (findNode.getNextNode().getValueNode() == valueNode){
                return findNode;
            }
            findNode = findNode.getNextNode();
        }
        return null;
    }

    public void clear() {
        headNode = null;
    }
    public int size() {
        int size = 1;
        NodeLinkedList<E> firstNode = headNode;
        while (firstNode.getNextNode() != null) {
            size++;
            firstNode = firstNode.getNextNode();
        }

        return size;
    }

    public E get(int index) {
        if (headNode == null) {
            System.out.println("LinkedList Empty");
        }
        if (index <= -1) {
            index = 0;
        }
        NodeLinkedList<E> findNode = headNode;
        int startindex = 0;
        while (startindex != index) {
            findNode = findNode.getNextNode();
            startindex++;
        }
        return findNode.getValueNode();
    }

    public static void main(String[] args) {

        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(11);

        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.remove(5);
        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("linkedList.get(-1) = " + linkedList.get(-1));
    }
}

