package pack7;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Prog1 {

    public static void main(String[] args) {
        Set<Apple> apples = Set.of();
        Predicate<Apple> appleColorPredicate = (Apple a) -> a.color() == 2;
        Predicate<Apple> appleWeightPredicate = a -> a.weight() > 100;
        List<Apple> apples1 = filterGeneric(apples, appleColorPredicate);
        filterGeneric(apples, appleWeightPredicate);
    }

    static List<Apple> filter(List<Apple> apples, Predicate<Apple> appleColorPredicate){
        return apples
                .stream()
                .filter(appleColorPredicate)
                .toList();
    }

    //generic
    static <T> List<T> filterGeneric(Collection<T> t, Predicate<T> p){
        return t.stream()
                .filter(p)
                .toList();

    }


}
