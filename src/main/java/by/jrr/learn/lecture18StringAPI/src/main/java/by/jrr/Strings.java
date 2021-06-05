package by.jrr;

import java.util.Arrays;
import java.util.Collection;

public class Strings{
    public void create(Collection<Strings> values, int counter) {
        System.out.println(values.toArray().toString());
    }

    public int calculate(int... values) {
        return Arrays.stream(values).
                reduce(0,Integer::sum);
    }

}
