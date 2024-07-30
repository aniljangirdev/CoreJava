package pack7;

import java.util.HashMap;
import java.util.Map;

public class Prog6 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Apple", 102.0);
        map.put("Banana", 19.0);
        map.put("Orange", 119.0);

        Task task = () -> System.out.println("test");
        task.execute();

        doSomething((Runnable) () -> {
            
        });

    }

    public static void doSomething(Task task){
        task.execute();
    }

    public static void doSomething(Runnable runnable){
        runnable.run();
    }



    interface Task {
        public void execute();
    }
}
