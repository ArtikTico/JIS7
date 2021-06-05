package jrr.generics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WithGenericTypeTest {
    @Test
    public void testingWithGeneric() {
        WithGenericType<Integer> withGenericTypeI = new WithGenericType<>();
        withGenericTypeI.setValue(1000);

        WithGenericType<String> withGenericTypeS = new WithGenericType<>();
        withGenericTypeS.setValue("2000");
        var value = withGenericTypeS.getValue();
        System.out.println(value);

    }

}