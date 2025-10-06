import java.util.Stack;

public class CreateStack {

public static Stack<Integer> createStack() {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < 5; i++) {
        stack.push(i);
    }
    return stack;
}

    
}
