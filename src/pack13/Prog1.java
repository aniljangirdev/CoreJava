package pack13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Prog1 {
    public static void main(String[] args) {

    }
}

class Rectangle implements Sized {


    @Override
    public int size() {
        return 10;
    }

    void test() {
        Iterator<String> objectIterator = Collections.emptyIterator();


        boolean b = removeIf(objectIterator, String::isEmpty);

    }

}

interface Sized {
    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    // use interface to handle with default method

    default <E> boolean removeIf1(Iterator<E> iterator, Predicate<? super E> filter) {
        boolean removed = false;
        while (iterator.hasNext()) {
            if (filter.test(iterator.next())) {
                iterator.remove();
                removed = true;
            }
        }
        return removed;
    }

    default <E> boolean removeIf(Iterator<E> iterator, Predicate<? super E> filter) {
        boolean removed = false;
        while (iterator.hasNext()) {
            if (filter.test(iterator.next())) {
                iterator.remove();
                removed = true;
            }
        }
        return removed;
    }
}
