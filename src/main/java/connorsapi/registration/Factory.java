package connorsapi.registration;

@FunctionalInterface
public interface Factory<I, O> {
    O build(I input);
}
