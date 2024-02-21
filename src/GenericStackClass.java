public class GenericStackClass<T> {
    private Object[] stack;
    private int zaehler;
    private int groeße;
    public GenericStackClass() {
        this.stack = new Object[10];
    }
    public GenericStackClass(int groeße) {
        this.zaehler = 0;
        this.stack = new Object[groeße];
    }

}