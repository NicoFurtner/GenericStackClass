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
    /**
     * push method adds an element to the stack
     * @param element
     */
    public void push(T element) throws StackFullException {
        if(this.stack.length > zaehler + 1) {
            throw new StackFullException();
        }
        stack[zaehler] = element;
        zaehler++;
    }
    /**
     * pop method removes the last added element
     */
    public void pop() throws StackEmptyException {
        if(this.stack == null) {
            throw new StackEmptyException();
        }
        else {
            stack[zaehler - 1] = null;
        }
    }
    public T peek() throws StackEmptyException {
        if(this.stack == null) {
            throw new StackEmptyException();
        }
        else {
            return (T) stack[zaehler - 1];
        }
    }

    public String list() {
        String list = "";
        for(int i = 0; i < stack.length; i++) {
            list += stack[i] + ";";
        }
        return list;
    }
}