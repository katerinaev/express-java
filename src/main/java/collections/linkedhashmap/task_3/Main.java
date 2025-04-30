package collections.linkedhashmap.task_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> history = new LinkedHashMap<>();
        for (int i = 0; i <= 12; i++) {
            if (history.size() == 10) {
                String firstKey = history.keySet().iterator().next();
                history.remove(firstKey);
            }
            history.put("pageID_" + i, "Page " + i);
        }
        System.out.println("User browsing history: ");
        for (Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
