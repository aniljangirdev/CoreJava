package pack4.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class Prog5 {
    public static void main(String[] args) {
        // consumer accept single input and return no output
        List<String> allName = List.of("test1", "test2", "test3");
        Consumer<String> stringConsumer = System.out::println;
        allName.forEach(stringConsumer);

        //Supplier
        //function that supplier or produce result of given type, its does not take any argument
        Supplier<Integer> stringSupplier = () -> new Random().nextInt(100);

        System.out.println(stringSupplier.get());

        // function
        // function is take T argument and return R argument
        // working like transformation
        Function<String, Integer> integerFunction = String::length;
        Integer test = integerFunction.apply("test");

        //ByFunction
        // its take two argument T,U and return R argument
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        Integer sum = biFunction.apply(10, 20);

        /* predicate */
        // its take single input argument and return boolean value
        Predicate<String> stringPredicate = (val) -> val.length() > 3;
        allName.stream()
                .filter(stringPredicate)
                .forEach(stringConsumer);
    }

    private Map<Integer, Long> findAllEmployeees(){
        List<Employee> employees = new ArrayList<>();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.counting()));
    }
}
