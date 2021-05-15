package lambdas;

@FunctionalInterface
public interface MyCustomInterface<T> {
    boolean test(T t);
}
