package Assignment_02;

class Stack4 {
    private int[] arr;
    private int top;

    Stack4(int size) {
        if (size <= 0) size = 16; // safety for invalid size
        arr = new int[size];
        top = -1;
    }

    void push(int val) {
        // Overflow check
        if (top + 1 >= arr.length) {
            int[] newArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[++top] = val;
    }

    int pop() {
        // Underflow check
        if (top < 0) {
            throw new IllegalStateException("Stack underflow: no elements to pop!");
        }
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

// 4️⃣ Evaluate postfix expression using stack
public class EvaluatePostfix {

    static int evaluate(String expr) {
        Stack4 stack = new Stack4(expr.length());

        for (char c : expr.toCharArray()) {
            if (Character.isWhitespace(c)) continue; // skip spaces

            if (Character.isDigit(c)) {
                // convert '3' → 3
                stack.push(c - '0');
            } else {
                // check stack has enough operands
                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("Invalid postfix: missing operands before operator " + c);
                }
                int val2 = stack.pop();

                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("Invalid postfix: missing left operand for operator " + c);
                }
                int val1 = stack.pop();

                switch (c) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/':
                        if (val2 == 0)
                            throw new ArithmeticException("Division by zero!");
                        stack.push(val1 / val2);
                        break;
                    case '^':
                        // Optional support for exponent
                        stack.push((int) Math.pow(val1, val2));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported operator: " + c);
                }
            }
        }

        // If valid, only one value should remain
        if (stack.isEmpty()) {
            throw new IllegalStateException("Invalid expression: stack empty at end");
        }

        int result = stack.pop();

        if (!stack.isEmpty()) {
            throw new IllegalStateException("Invalid postfix: extra operands left in stack");
        }

        return result;
    }

    public static void main(String[] args) {
        String postfix = "231*+9-"; // Equivalent to 2 + (3*1) - 9 = -4
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Result = " + evaluate(postfix));
    }
}
