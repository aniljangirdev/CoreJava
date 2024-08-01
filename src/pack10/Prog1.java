package pack10;

import java.util.ArrayList;
import java.util.List;

public class Prog1 {
    public static void main(String[] args) {
        City paris = new City("Paris", 2161000);

        List<City> cities = new ArrayList<>();
        cities.add(new City("London", 8982000));
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));

        System.out.println(cities.contains(paris));
    }
}
