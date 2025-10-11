package Assignment_02;

class Stack3 {
    private char[] arr;
    private int top;

    Stack3(int size) {
        if (size <= 0) size = 16;
        arr = new char[size];
        top = -1;
    }

    void push(char c) {
        // اگر array بھر جائے تو اسے double کر دیتے ہیں (overflow سے بچنے کے لیے)
        if (top + 1 >= arr.length) {
            char[] newArr = new char[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[++top] = c;
    }

    char pop() {
        if (top < 0) throw new IllegalStateException("Stack underflow - trying to pop from empty stack");
        return arr[top--];
    }

    char peek() {
        if (top < 0) throw new IllegalStateException("Stack is empty - cannot peek");
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

// 3️⃣ Convert infix expression to postfix using stack
public class InfixToPostfix {

    // precedence شامل کرتا ہے '^' کو بھی
    static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        if (c == '^') return 3; // highest
        return -1;
    }

    // '^' right-associative ہے، باقی left-associative
    static boolean isRightAssociative(char c) {
        return c == '^';
    }

    static String convert(String infix) {
        Stack3 stack = new Stack3(infix.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // اگر whitespace ہو تو skip کریں (اضافی سہولت)
            if (Character.isWhitespace(c)) continue;

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                // pop until '(' or error if unmatched parentheses
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("Mismatched parentheses: no matching '(' for ')'");
                }
                stack.pop(); // pop the '('
            } else { // operator
                // while there is an operator at the top of the stack with greater precedence
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char topOp = stack.peek();
                    int precTop = precedence(topOp);
                    int precCurr = precedence(c);

                    if (!isRightAssociative(c) && precCurr <= precTop) {
                        // current operator is left-associative and has <= precedence
                        result.append(stack.pop());
                    } else if (isRightAssociative(c) && precCurr < precTop) {
                        // current operator is right-associative and has < precedence
                        result.append(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.push(c);
            }
        }

        // pop remaining operators
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            if (ch == '(' || ch == ')') {
                throw new IllegalArgumentException("Mismatched parentheses: leftover " + ch);
            }
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String infix = "A+(B*C-(D/E^F)*G)*H";
        System.out.println("Infix : " + infix);
        System.out.println("Postfix: " + convert(infix));
    }
}
