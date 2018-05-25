package com.example.hashmap.Entity;

public class Entry<K,V> {
    final K key;
    V value;
    Entry<K,V> next;

    public Entry(K k, V v, Entry<K,V> next){
        this.key = k;
        this.value = v;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry<K, V> getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o){
        boolean isEqual = false;
        if(!(o instanceof Entry)){return isEqual;}
        else{
            Entry e = (Entry)o;
            Object k1 = getKey();
            Object k2 = e.getKey();
            if (k1 == k2 || (k1 != null && k1.equals(k2))) {
                Object v1 = getValue();
                Object v2 = e.getValue();
                if (v1 == v2 || (v1 != null && v1.equals(v2)))
                    isEqual = true;
            }

        }
        return isEqual;
    }

    public final int hashCode() {
        return (key==null   ? 0 : key.hashCode()) ^ (value==null ? 0 : value.hashCode());
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
