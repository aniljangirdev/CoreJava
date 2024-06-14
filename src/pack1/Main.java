package pack1;

import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private final LinkedList[] buckets;
    private int size;

    public CustomHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public CustomHashMap(int capacity) {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    public void put(K key, V value) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null");

        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update the value if the key already exists
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null");

        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null; // Key not found
    }

    public void remove(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null");

        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % buckets.length);
    }

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Size: " + map.size());
        System.out.println("Value for 'two': " + map.get("two"));

        map.remove("two");
        System.out.println("Size after removal: " + map.size());
        System.out.println("Value for 'two' after removal: " + map.get("two"));
    }
}
