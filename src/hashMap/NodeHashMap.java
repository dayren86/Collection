package hashMap;

public class NodeHashMap <K, V> {
    private int hash;
    private K key;
    private V valueNode;
    private NodeHashMap<K, V> nextNode = null;

    public NodeHashMap(int hash, K key, V valueNode) {
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

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public Object getValueNode() {
        return valueNode;
    }

    public void setValueNode(V valueNode) {
        this.valueNode = valueNode;
    }

    public NodeHashMap<K, V> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeHashMap<K, V> nextNode) {
        this.nextNode = nextNode;
    }
}
