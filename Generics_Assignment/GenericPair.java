public class GenericPair<T, U> {
    private final T first;
    private final U second;
    public GenericPair(T first, U second) { this.first = first; this.second = second; }
    public T getFirst() { return first; }
    public U getSecond() { return second; }
    public static void main(String[] args) {
        GenericPair<String, Integer> student = new GenericPair<>("Amol", 20);
        System.out.println(student.getFirst() + " -> " + student.getSecond());
    }
}
