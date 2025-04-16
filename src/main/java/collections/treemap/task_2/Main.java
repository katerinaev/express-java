package collections.treemap.task_2;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zahar", 8);
        treeMap.put("Dasha", 9);
        treeMap.put("Polina", 7);
        treeMap.put("Artem", 10);
        treeMap.put("Denis", 6);
        System.out.println("Min key: " + treeMap.firstKey());
        System.out.println("Max key: " + treeMap.lastKey());
    }
}
