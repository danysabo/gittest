public class GenericClass<T> {
    private final T elem;

    public GenericClass(T elem) {
        this.elem = elem;
    }


    public T getElem() {
        return elem;
    }
}
