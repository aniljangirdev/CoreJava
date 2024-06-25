package pack4.builder;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheManager<K, V> {
    private static CacheManager instance;
    private final Map<K, V> cache;

    private CacheManager() {
        cache = new ConcurrentHashMap<>();
    }

    public static CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;
    }

    public void put(K key, V value) {
        this.cache.put(key, value);
    }

    public V get(K key) {
        return this.cache.get(key);
    }

    public void delete(K key) {
        this.cache.remove(key);
    }

    public void clear() {
        this.cache.clear();
    }
}
