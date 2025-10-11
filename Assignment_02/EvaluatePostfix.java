package Assignment_02;

class Stack4 {
    int[] arr;
    int top;
    Stack4(int size) {
        arr = new int[size];
        top = -1;
    }
    void push(int val) {
        arr[++top] = val;
    }
    int pop() {
        return arr[top--];
    }
}

// 4️⃣ Evaluate postfix expression using stack

public class EvaluatePostfix {
    static int evaluate(String expr) {
        Stack4 stack = new Stack4(expr.length());
        for (char c : expr.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (c) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/': stack.push(val1 / val2); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "231*+9-";
        System.out.println("Result = " + evaluate(postfix));
    }
}
