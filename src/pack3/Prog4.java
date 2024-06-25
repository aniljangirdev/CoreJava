package pack3;

import java.util.*;
import java.util.stream.Collectors;

public class Prog4 {
    public static void main(String[] args) {

        // wap to print map by sorted value
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 5);
        originalMap.put("B", 2);
        originalMap.put("C", 8);
        originalMap.put("D", 1);

        Map<String, Integer> sortedMapByKey = getSortedMapByKey(originalMap);
        System.out.println(sortedMapByKey);

    }

    private static Map<String, Integer> getSortedMapByKey(Map<String, Integer> originalMap) {
        // convert map to lost for value sorting
        List<Map.Entry<String, Integer>> stringLinkedList = new ArrayList<>(originalMap.entrySet());

        // list sorted by comparator
        stringLinkedList.sort(Comparator.comparingInt(Map.Entry::getValue));

        // iterate to store each entry from list entries to LinkedHashMap(to maintain insertion order)
        Map<String, Integer> integerMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : stringLinkedList) {
            integerMap.put(entry.getKey(), entry.getValue());
        }
        return integerMap;
    }

    private static LinkedHashMap<String, Integer> getSortedMapByKeyUsingJava8(Map<String, Integer> originalMap) {
        return originalMap
                .entrySet()
                .stream()
                // to reverse by desc order for value
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                // to reverse by asc order for value
                // .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        LinkedHashMap::new
                ));
    }
}
