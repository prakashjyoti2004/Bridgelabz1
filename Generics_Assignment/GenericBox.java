public class GenericBox<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(42);
        System.out.println("Integer in box: " + intBox.get());

        GenericBox<String> strBox = new GenericBox<>();
        strBox.set("Hello");
        System.out.println("String in box: " + strBox.get());

        GenericBox<Double> dblBox = new GenericBox<>();
        dblBox.set(3.1415);
        System.out.println("Double in box: " + dblBox.get());
    }
}
