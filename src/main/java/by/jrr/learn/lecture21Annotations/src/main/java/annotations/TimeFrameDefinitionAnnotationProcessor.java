package annotations;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Objects;

@Slf4j
public class TimeFrameDefinitionAnnotationProcessor {

    public void execute(Object object, Object... values) throws Exception {
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(TimeFrameDefinition.class)) {
                long start = System.currentTimeMillis();
                if (!Objects.isNull(values)) {
                    System.out.println(method.invoke(object, values));
                } else {
                    System.out.println(method.invoke(object));
                }

                Thread.sleep(100);
                log.info(method.getName() + " " + method.getParameterCount() + " ExecutionTime: " + (System.currentTimeMillis() - start) + " ms");
            }
        }
    }
}
