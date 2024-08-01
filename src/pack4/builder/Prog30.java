package pack4.builder;

import javax.swing.plaf.synth.SynthTreeUI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Prog30 {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println((int) ch);
        Consumer<String> stringConsumer = System.out::println;

        Supplier<String> stringSupplier = () -> "Test";

        int[] array = new int[]{10, 2, 5};

        Integer i = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println(i);


    }
}
