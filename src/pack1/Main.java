package pack1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Size: " + map.size());
        System.out.println("Value for 'two': " + map.get("two"));

        map.remove("two");
        System.out.println("Size after removal: " + map.size());
        System.out.println("Value for 'two' after removal: " + map.get("two"));

        User user = User
                .builder()
                .build();

    }
}
