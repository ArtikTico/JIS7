package by.jrr.learn.lecture6ObjectsAndClasses;

public class ValidateTurtleService {
    public void validateAge(Integer age) {
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Illegal value for age");
        }
    }
}
