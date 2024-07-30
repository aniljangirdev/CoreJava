package pack5;

import java.util.Objects;

public final class ImmutableClass {
    private final int value;

    public ImmutableClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        ImmutableClass that = (ImmutableClass) obj;
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}


