package Assignment_02;

class Stack3 {
    char[] arr;
    int top;
    Stack3(int size) {
        arr = new char[size];
        top = -1;
    }
    void push(char c) {
        arr[++top] = c;
    }
    char pop() {
        return arr[top--];
    }
    char peek() {
        return arr[top];
    }
    boolean isEmpty() {
        return top == -1;
    }
}

// 3️⃣ Convert infix expression to postfix using stack

public class InfixToPostfix {
    static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return -1;
    }

    static String convert(String infix) {
        Stack3 stack = new Stack3(infix.length());
        StringBuilder result = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String infix = "A+(B*C-(D/E^F)*G)*H";
        System.out.println("Postfix: " + convert(infix));
    }
}
