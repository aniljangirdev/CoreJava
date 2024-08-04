package model;

import java.util.Optional;

public record Car(
        Optional<Insurance> insurance

) {
    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}