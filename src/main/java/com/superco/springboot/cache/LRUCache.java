package com.superco.springboot.cache;

import java.util.Optional;

public class LRUCache<K, V> implements Cache<K, V> {

    @Override
    public boolean set(Object key, Object value) {
        return false;
    }

    @Override
    public Optional get(Object key) {
        return Optional.empty();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
