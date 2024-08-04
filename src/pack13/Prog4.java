package pack13;

import model.Car;
import model.Insurance;
import model.Person;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Prog4 {
    public static void main(String[] args) {
        Optional<Insurance> insurance = Optional.of(new Insurance("Anil"));
        Optional<Car> car = Optional.of(new Car(insurance));
        Optional<Person> person = Optional.of(new Person(car));
        String carInsuranceName = getCarInsuranceName(person);
        System.out.println(carInsuranceName);

        Person p1 = person.orElse(null);
        List<Person> p11 = List.of(p1, p1);
        Set<String> carInsuranceNames = getCarInsuranceNames(p11);
        System.out.println(carInsuranceNames);

        Integer integer = convertStringToInt("123")
                .orElse(0);

    }

    private static String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::car)
                .flatMap(Car::insurance)
                .map(Insurance::getName)
                .orElse("n/A");
    }

    private static Set<String> getCarInsuranceNames(List<Person> p11){
        return p11
                .stream()
                .map(Person::getCar)
                .map(car -> car.flatMap(Car::getInsurance))
                .map(insurance -> insurance.map(Insurance::name))
                .flatMap(Optional::stream)
                .collect(Collectors.toSet());
    }

    private static Optional<Integer> convertStringToInt(String val){
        try {
            int result = Integer.parseInt(val);
            return Optional.of(result);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}

