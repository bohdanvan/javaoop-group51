package com.bvan.oop.lesson9.map;

import com.bvan.oop.common.Person;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToUserMap = new HashMap<>();

        idToUserMap.put(1L, new Person("John", 25)); // O(1)
        idToUserMap.put(1000L, new Person("Bob", 30));
        idToUserMap.put(2000L, new Person("Jessy", 20));
        idToUserMap.put(3000L, null);

        idToUserMap.put(200L, new Person("Phil", 50));

        System.out.println(idToUserMap.get(200L)); // 0(1)

        System.out.println(idToUserMap.containsKey(300L)); // O(1)
        System.out.println(idToUserMap.get(300L));
        System.out.println();

        System.out.println(idToUserMap.containsKey(1000L));
        System.out.println(idToUserMap.get(1000L));

        System.out.println(idToUserMap.size());

        printKeys(idToUserMap);
        printValues(idToUserMap);
        printEntries(idToUserMap);
    }

    private static void printKeys(Map<Long, Person> idToUserMap) {
        System.out.println("Keys:");
        Set<Long> keys = idToUserMap.keySet();
        for (Long key : keys) {
            System.out.println(key);
        }
        System.out.println();
    }

    private static void printValues(Map<Long, Person> idToUserMap) {
        System.out.println("Values:");
        Collection<Person> values = idToUserMap.values();
        for (Person value : values) {
            System.out.println(value);
        }
        System.out.println();
    }

    private static void printEntries(Map<Long, Person> idToUserMap) {
        System.out.println("Entries:");
        Set<Map.Entry<Long, Person>> entries = idToUserMap.entrySet();
        for (Map.Entry<Long, Person> entry : entries) {
            System.out.println(entry);
        }
        System.out.println();
    }
}
