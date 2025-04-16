package collections.hashmap.task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Artem", 10);
        people.put("Ivan", 14);
        people.put("July", 36);
        people.put("Igor", 23);
        printUnderage(people);
    }
    static void printUnderage(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }
        }
    }
}
