package by.jrr.learn.testwritting;

import lombok.Data;

import java.util.Objects;

/**
 * @author Artsemi Stankevich
 * @version 14
 */
@Data
public class TestWriting {

    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestWriting that = (TestWriting) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
