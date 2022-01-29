package hashMap;

public class NodeHashMap {
    private int hash;
    private int key;
    private Object valueNode;
    private NodeHashMap nextNode = null;

    public NodeHashMap(int hash, int key, Object valueNode) {
        this.hash= hash;
        this.key = key;
        this.valueNode = valueNode;
    }

    public Object getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValueNode() {
        return valueNode;
    }

    public void setValueNode(Object valueNode) {
        this.valueNode = valueNode;
    }

    public NodeHashMap getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeHashMap nextNode) {
        this.nextNode = nextNode;
    }
}
