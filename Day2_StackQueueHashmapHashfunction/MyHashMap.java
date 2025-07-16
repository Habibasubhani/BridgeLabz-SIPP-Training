package LocalRepo.Day2_StackQueueHashmapHashfunction;

import java.util.*;

class Entry {
    int key;
    int value;
    Entry next;

    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class MyHashMap {
    private static final int SIZE = 10;
    Entry[] table = new Entry[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Entry newEntry = new Entry(key, value);

        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry curr = table[index];
            Entry prev = null;
            while (curr != null) {
                if (curr.key == key) {
                    curr.value = value;
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
            prev.next = newEntry;
        }
    }

    public Integer get(int key) {
        int index = hash(key);
        Entry curr = table[index];
        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Entry curr = table[index];
        Entry prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null)
                    table[index] = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(12, 30);
        System.out.println(map.get(2));    
        System.out.println(map.get(12));   
        map.remove(2);
        System.out.println(map.get(2));    
    }
}

