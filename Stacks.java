import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        // Create new Stack Here

        Stack s = new Stack<Integer>();

        // push elements in the stack s

        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        // Pop elements from the stack 
        while(!s.empty()){
            System.out.println(s.pop());
        }


    }
    
}
