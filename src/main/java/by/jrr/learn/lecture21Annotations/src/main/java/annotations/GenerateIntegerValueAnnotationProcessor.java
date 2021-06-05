package annotations;

import java.lang.reflect.Field;
import java.util.Random;

public class GenerateIntegerValueAnnotationProcessor {
    public void analyze(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        var declaredFields = clazz.getDeclaredFields();
        for (Field field:declaredFields
             ) {
            if (field.isAnnotationPresent(GenerateIntValue.class)) {
                field.setAccessible(true);
                var generatedValue = new Random().nextInt(10);
                field.set(object, generatedValue);
                System.out.println("add number: " + generatedValue);
            }
        }
    }
}
