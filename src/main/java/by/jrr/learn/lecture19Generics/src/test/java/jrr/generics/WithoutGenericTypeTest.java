package jrr.generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WithoutGenericTypeTest {

    @Test
    public void testGenericType() {
        WithoutGenericType withoutGenericType = new WithoutGenericType();
        withoutGenericType.setValue("200");
        Object valueS = (String) withoutGenericType.getValue();

        withoutGenericType.setValue(1000);
        Object valueI = (Integer) withoutGenericType.getValue();

        withoutGenericType.setValue(1000L);
        //        Object valueBD = (String) withoutGenericType.getValue();//Ошибка в райнтайме.

        withoutGenericType.setValue(1000.0);
        withoutGenericType.setValue(new BigDecimal(100));
        System.out.println(withoutGenericType.getValue());

        List<String> values = new ArrayList<>();
        values.add("String");
        Integer integer;

    }
}