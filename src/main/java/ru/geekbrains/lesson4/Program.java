package ru.geekbrains.lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);


        HashMap<String, String> hashMap = new HashMap<>(4);

        String addResult = hashMap.put("+7900111223300", "AAAAAAA");
        addResult = hashMap.put("+7900111223301", "BBBBBBB");
        addResult = hashMap.put("+7900111223300", "DDDDDDD");
        addResult = hashMap.put("+7900111223302", "EEEEEEE1");
        addResult = hashMap.put("+7900111223303", "EEEEEEE2");
        addResult = hashMap.put("+7900111223304", "EEEEEEE3");
        addResult = hashMap.put("+7900111223305", "EEEEEEE4");
        addResult = hashMap.put("+7900111223306", "EEEEEEE5");
        addResult = hashMap.put("+7900111223307", "EEEEEEE6");
        addResult = hashMap.put("+7900111223308", "EEEEEEE7");
        addResult = hashMap.put("+7900111223309", "EEEEEEE8");

        try {
            String searchResult = hashMap.get("+7900111223307");
            System.out.println(searchResult);
        } catch (NullPointerException e) {
            System.out.println("Key not found");
        }

        String searchResult = hashMap.get("+7900111223307");

        System.out.println(hashMap);

        for (HashMap.Entry<String, String> entity : hashMap.entrySet()) {
            System.out.printf("%s - %s", entity.getKey(), entity.getValue());
        }
    }

}
