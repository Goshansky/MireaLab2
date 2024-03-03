package pr1.num3;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
