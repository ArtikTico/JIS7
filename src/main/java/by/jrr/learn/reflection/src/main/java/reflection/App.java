package reflection;

import reflection.alexexample.DetailLine;
import reflection.alexexample.Line;
import reflection.alexexample.Slips;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Product product = new Product();

        Class clazz;
        Field field;
        Method method;
        Constructor constructor;

//        Class<? extends Product> aClass = product.getClass();
        Class<Product> productClass = Product.class;

        String simpleName = productClass.getSimpleName();
        String name = productClass.getName();
        Field[] fields = productClass.getFields();
        Field[] declaredFields = productClass.getDeclaredFields();
        Method[] methods = productClass.getMethods();
        Method[] declaredMethods = productClass.getDeclaredMethods();

        ClassLoader classLoader = productClass.getClassLoader();

        Constructor<?>[] constructors = productClass.getConstructors();
        Constructor<?>[] declaredConstructors = productClass.getDeclaredConstructors();

        System.out.println(simpleName);
        System.out.println(name);
        System.out.println(Arrays.toString(fields));
        System.out.println(Arrays.toString(declaredFields));
        System.out.println(Arrays.toString(methods));
        System.out.println(Arrays.toString(declaredMethods));
        System.out.println(classLoader);
        System.out.println(Arrays.toString(constructors));
        System.out.println(Arrays.toString(declaredConstructors));

        Constructor<Product> declaredConstructor = productClass.getDeclaredConstructor();
        System.out.println(declaredConstructor);
        declaredConstructor.setAccessible(true);
        var product = declaredConstructor.newInstance();
        System.out.println(product);

        Field privateName = productClass.getDeclaredField("privateName");
        privateName.setAccessible(true);
        privateName.set(product, "Hello");

        System.out.println(privateName.get(product));

        Method printInfoProductPrivate = productClass.getDeclaredMethod("printInfoProductPrivate", String.class, double.class);

        printInfoProductPrivate.setAccessible(true);

        printInfoProductPrivate.invoke(product, "Hello", 10.0);

        DetailLine detailedLine1 = new DetailLine(1114L);
        DetailLine detailedLine2 = new DetailLine(2222L);
        DetailLine detailedLine3 = new DetailLine(3333L);
        DetailLine detailedLine4 = new DetailLine(4444L);

        Line line1 = new Line();
        line1.setDetailLine(detailedLine1);
        Line line2 = new Line();
        line2.setDetailLine(detailedLine2);
        Line line3 = new Line();
        line3.setDetailLine(detailedLine3);
        Line line4 = new Line();
        line4.setDetailLine(detailedLine4);

        List<Line> listOne = List.of(line1,line2);
        List<Line> listTwo = List.of(line3,line4);

        List<Slips> slips = new ArrayList<>();
        slips.add(new Slips(true, listOne));
        slips.add(new Slips(false, listTwo));

        var mapa = slips.stream()
                .flatMap(slip -> slip.getLines().stream()
                        .map(line -> Map.of(line.getDetailLine().getDetailLineId(), slip.getOriginal())))
                .collect(toMap(Map::keySet,Map::values));


    }
}
