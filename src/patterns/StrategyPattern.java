package patterns;

public class StrategyPattern {
    public static void main(String[] args) {
        Validator numnericValidator = new Validator(s -> s.matches("\\d+"));
        boolean b1 = numnericValidator.validate("2");
        System.out.println(b1);

        Validator allLowerCaseValidator = new Validator(s -> s.matches("[a-z]+"));
        boolean b2 = allLowerCaseValidator.validate("t2");
        System.out.println(b2);


    }
}

class Validator {
    private final ValidationStrategy validationStrategy;

    Validator(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validate(String str) {
        return validationStrategy.execute(str);
    }
}
interface ValidationStrategy {
    boolean execute(String str);
}
