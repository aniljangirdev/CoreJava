package pack3;

import java.util.*;

public class Prog31 {

    public static void main(String[] args) {
        Map<String, Integer> integerMap = new HashMap<>();
        integerMap.put("Anil", 3);
        integerMap.put("Rakesh", 2);
        integerMap.put("Pawan", 6);
        integerMap.put("Prasant", 8);

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(integerMap.entrySet());

    }
}
