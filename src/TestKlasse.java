/**
 * TestKlasse testet die GenericStackClass
 * @author Nico Furtner
 * @version 2024-02-21
 */
 public class TestKlasse {
    public static void main(String[] args) {
        GenericStackClass<Integer> integerstack = new GenericStackClass<>();
        try {
            integerstack.push(Integer.valueOf(27));
            integerstack.push(Integer.valueOf(3));
            System.out.println("Integer Stack: " + integerstack.list());
            System.out.println("Peek: " + integerstack.peek());
            System.out.println("nach peek: " + integerstack.list());
            System.out.println("pop: " + integerstack.pop());
            System.out.println("nach pop: " + integerstack.list());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }
        GenericStackClass<String> stringStack = new GenericStackClass<>(5);
        try {
            stringStack.push("gruesse");
            stringStack.push("Tat");
            stringStack.push("Maus");
            System.out.println("---------\nString Stack: " + stringStack.list());
            System.out.println("Peek: " + stringStack.peek());
            System.out.println("nach peek: " + stringStack.list());
            System.out.println("pop: " + stringStack.pop());
            System.out.println("nach pop: " + stringStack.list());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }

        GenericStackClass<User> userStack = new GenericStackClass<>(5);
        try {
            User u = new User("Nico");
            userStack.push(u);
            User x = userStack.pop();
            x.testing();
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }
    }
}
