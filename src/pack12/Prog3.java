package pack12;

import java.util.*;
import java.util.stream.Collectors;

public class Prog3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ashish", 2);
        map.put("yatin", 7);
        map.put("Tarun", 3);
        map.put("Prakash", 4);

        SortedMap<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);

        LinkedHashMap<String, Integer> linkMap = new LinkedHashMap<>(map);
        System.out.println(linkMap); // sort by insertion order map

//        Collections.sort(map);
        System.out.println(map); // normal map

        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println(treeMap); // sort by natural order map


        // sort by value
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        entryList.sort(Comparator.comparing(Map.Entry::getValue));

        Map<String, Integer> output = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            output.put(entry.getKey(), entry.getValue());
        }

        System.out.println(output);

        Map<String, Integer> sortedByValue =
                map
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("sorted" + sortedByValue);


    }
}
