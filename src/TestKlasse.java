public class TestKlasse {
    public static void main(String[] args) {
        GenericStackClass<Integer> integerstack = new GenericStackClass<>();
        try {
            integerstack.push(2);
            integerstack.push(27);
            integerstack.push(3);
            System.out.println("Integer Stack: " + integerstack.list());
            System.out.println("Peek: " + integerstack.peek());
            System.out.println("nach peek: " + integerstack.list());
            integerstack.pop();
            System.out.println("nach pop: " + integerstack.list());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }
        GenericStackClass<String> stringStack = new GenericStackClass<>(5);
        try {
            stringStack.push("gruesse");
            stringStack.push("Tat");
            stringStack.push("Maus");
            System.out.println("String Stack: " + stringStack.list());
            System.out.println("Peek: " + stringStack.peek());
            System.out.println("nach peek: " + stringStack.list());
            stringStack.pop();
            System.out.println("nach pop: " + stringStack.list());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }
    }
}
