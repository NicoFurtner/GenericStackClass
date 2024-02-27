/**
 * GenericStackClass
 * @author Nico Furtner
 * @version 2024-02-21
 * @param <T>
 */
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
     * @param element element to be added
     */
    public void push(T element) throws StackFullException {
        if(this.stack.length < zaehler + 1) {
            throw new StackFullException();
        }
        stack[zaehler] = element;
        zaehler++;
    }

    /**
     * pop method removes the last added element
     * @throws StackEmptyException stack is empty
     * @param
     */
    public T pop() throws StackEmptyException {
        if(this.stack == null) {
            throw new StackEmptyException();
        }
        else {
            String a = "";
            T backup = (T)stack[zaehler - 1];
            a +=  stack[zaehler - 1];
            stack[zaehler - 1] = null;
            return backup;
        }
    }
    /**
     * peek returns the last added element without removing it
     * @return last added element
     * @throws StackEmptyException stack is empty
     */
    public T peek() throws StackEmptyException {
        if(this.stack == null) {
            throw new StackEmptyException();
        }
        else {
            return (T) stack[zaehler - 1];
        }
    }
    /**
     * list returns all added elements in a string seperated by ;
     * @return String of addes elements
     */
    public String list() {
        String list = "";
        for(int i = 0; i < stack.length; i++) {
            if(stack[i] == null) {
                break;
            }
            list += stack[i];
            if( i < groeße + 1) {
                list += ";";
            }
        }
        return list;
    }
}