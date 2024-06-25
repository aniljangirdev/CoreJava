package pack3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prog11 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = map.get("key1");
        if (list1 == null) {
            list1 = new ArrayList<>();
            list1.add("Test1");
            list1.add("Test2");
        }
        map.put("key1",list1);
        System.out.println(map);

    }

    static class  Student{
        private final int id;
        private final String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", hashcode='" + this.hashCode() + '\'' +
                    '}';
        }

    }
}
