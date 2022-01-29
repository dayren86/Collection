package linkedList;
public class NodeLinkedList<E> {
    private E valueNode;
    private NodeLinkedList<E> nextNode;
    private NodeLinkedList<E> prevNode;

    public NodeLinkedList() {

    }

    public NodeLinkedList(E valueNode) {
        this.valueNode = valueNode;
    }

    public NodeLinkedList(E valueNode, NodeLinkedList<E> nextNode, NodeLinkedList<E> prevNode) {
        this.valueNode = valueNode;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public E getValueNode() {
        return valueNode;
    }

    public void setValueNode(E valueNode) {
        this.valueNode = valueNode;
    }

    public NodeLinkedList<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeLinkedList<E> nextNode) {
        this.nextNode = nextNode;
    }

    public NodeLinkedList<E> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(NodeLinkedList<E> prevNode) {
        this.prevNode = prevNode;
    }
}
