package patterns;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChainOrRepsonsibility {
    public static void main(String[] args) {

        // we can also use function interface instead UnaryOperator
        UnaryOperator<String> f1 = (String str) -> "From Raoul, Mario and Alan:" + str;
        UnaryOperator<String> f2 = (String str) -> str.replaceAll("labdas", "Lambda");

        Function<String, String> pipeline = f1.andThen(f2);
        String apply = pipeline.apply("Aren't labdas really sexy?!!");
        System.out.println(apply);
    }
}
