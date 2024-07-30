package pack9;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prog6 {
    public static void main(String[] args) {
        int no = 7;
        boolean prime = isPrime(no);
        System.out.println(prime);
        printRandom();

    }

    private static boolean isPrime(int no) {
        int noRoot = (int) Math.sqrt(no);
        return IntStream.rangeClosed(2, noRoot)
                .noneMatch(i -> no % i == 0);
    }

    private static void printRandom (){
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }

}
