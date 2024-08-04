package model;

import java.util.Optional;

public record Person(
        Optional<Car> car
) {
    public Optional<Car> getCar() {
        return car;
    }
}
