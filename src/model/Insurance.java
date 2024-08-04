package model;

import java.util.Optional;

public record Insurance(
        String name
) {

    public String getName() {
        return name;
    }
}