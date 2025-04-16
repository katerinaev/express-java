package collections.treemap.task_1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zahar", 8);
        treeMap.put("Dasha", 9);
        treeMap.put("Polina", 7);
        treeMap.put("Artem", 10);
        treeMap.put("Denis", 6);
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " got " + entry.getValue());
        }
    }
}
