package org.brainacad;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> fruits = Lists.newArrayList("banana", "kivi", "cherry");
        fruits.forEach(System.out::println);

        Set<Integer> testSet = Sets.newLinkedHashSet();
        Set<Integer> testSetNative = new LinkedHashSet<>();

        List<String> reverseFruits = Lists.reverse(fruits);
        reverseFruits.forEach(System.out::println);

        Multimap<String, String> map = ArrayListMultimap.create();
        map.put("key", "firstValue");
        map.put("key", "secondValue");
        System.out.println(map);

        //Это старый вариант
        Map<String, List<String>> oldMap = new HashMap<>();
        if(oldMap.containsKey("key")){
            oldMap.get("key").add("asdasd");
        } else {
            List<String> list = new ArrayList<>();
            list.add("asdasd");
            oldMap.put("key", list);
        }
    }
}
