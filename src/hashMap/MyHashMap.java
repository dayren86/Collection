package hashMap;

public class MyHashMap<K, V> {
    private final NodeHashMap[] hashArray = new NodeHashMap[16];

    private int findIndexArray(K key) {
        return key.hashCode() & 16 - 1;
    }

    private NodeHashMap searchPrev(NodeHashMap findNode, K key) {
        while (findNode.getNextNode() != null) {
            if (findNode.getNextNode().getKey() == key) {
                return findNode;
            }
            findNode = findNode.getNextNode();
        }
        return null;
    }

    private boolean searchCollision (K key, int indexArray, V value) {
        NodeHashMap nodeHashMap = hashArray[indexArray];


        if (nodeHashMap.getKey() == key) {
            nodeHashMap.setValueNode(value);
            return false;
        }
        while (nodeHashMap.getNextNode() != null) {
            if (nodeHashMap.getNextNode().getKey() == key) {
                nodeHashMap.getNextNode().setValueNode(value);
                return false;
            }
            nodeHashMap = nodeHashMap.getNextNode();
        }

        return true;
    }

    public void put(K key, V value) {
        int findIndexArray = findIndexArray(key);
        NodeHashMap<K, V> nodeHashMap = new NodeHashMap<>(findIndexArray, key, value);
        if (hashArray[findIndexArray] == null) {
            hashArray[findIndexArray] = nodeHashMap;
        } else {
            if (searchCollision(key, findIndexArray, value)) {
                NodeHashMap findNode = hashArray[findIndexArray];
                while (findNode.getNextNode() != null) {
                    findNode = findNode.getNextNode();
                }
                findNode.setNextNode(nodeHashMap);
            }
        }
    }

    public void remove(K key) {
        int findIndexArray = findIndexArray(key);
        if (hashArray[findIndexArray] == null) {
            System.out.println("Empty");
            return;
        }
        NodeHashMap findNode = hashArray[findIndexArray];
        //if you need to delete the first node, take a link to the second node and overwrite the array
        if (findNode.getKey() == key) {
            hashArray[findIndexArray] = findNode.getNextNode();
        } else {
            NodeHashMap<K, V> prev = searchPrev(findNode, key);
            NodeHashMap del = prev.getNextNode();
            prev.setNextNode(del.getNextNode());
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < hashArray.length; i++) {
            NodeHashMap findNode = hashArray[i];
            while (findNode != null) {
                size++;
                findNode = findNode.getNextNode();
            }
        }
        return size;
    }

    public V get(K key) {
        int findIndexArray = findIndexArray(key);

        NodeHashMap<K, V> findNode = hashArray[findIndexArray];
        while (findNode != null) {
            if (findNode.getKey() == key) {
                return (V) findNode.getValueNode();
            }
            findNode = findNode.getNextNode();
        }


        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, Integer> hashMap = new MyHashMap<>();
        hashMap.put(6, 6);
        hashMap.put(70, 71);
        hashMap.put(70, 72);
        hashMap.put(70, 73);
        hashMap.put(6, 7);
        //hashMap.put(86, 86);

        System.out.println("hashMap.get(0) = " + hashMap.get(0));
        System.out.println("hashMap.get(6) = " + hashMap.get(6));
        System.out.println("hashMap.get(86) = " + hashMap.get(86));
        System.out.println("hashMap.get(70) = " + hashMap.get(70));
        System.out.println("hashMap.size() = " + hashMap.size());

    }

}
