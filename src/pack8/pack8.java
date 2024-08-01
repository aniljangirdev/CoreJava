package pack8;

import java.util.*;
import java.util.stream.IntStream;

public class pack8 {
    public static void main(String[] args) {
        int[] input = new int[]{234, 234, 23, 234, 234, 354, 45, 623, 42};

        Arrays.stream(input)
                .max()
                .orElse(-1);

        IntStream
                .rangeClosed(1, 100)
                .filter(x -> x % 2 == 0)
                .toArray();

        Map<String,Integer> priceMap= new HashMap<>();
        priceMap.put("Apple",30);
        priceMap.put("Banana",50);
        priceMap.put("Orange",45);
        priceMap.put("Guava",90);
        priceMap.put("Dragon Fruit",44);

        priceMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

    }
}
