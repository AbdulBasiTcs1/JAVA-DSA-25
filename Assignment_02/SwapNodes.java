package Assignment_02;
import java.util.Scanner;

class Node2 {
    int data;
    Node2 next;
    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

// 2️⃣ Search two values and swap them if found

public class SwapNodes {
    static void swapNodes(Node2 head, int val1, int val2) {
        if (val1 == val2) return;

        Node2 prev1 = null, prev2 = null, node1 = head, node2 = head;

        while (node1 != null && node1.data != val1) {
            prev1 = node1;
            node1 = node1.next;
        }

        while (node2 != null && node2.data != val2) {
            prev2 = node2;
            node2 = node2.next;
        }

        if (node1 == null || node2 == null) {
            System.out.println("One or both elements not found.");
            return;
        }

        if (prev1 != null)
            prev1.next = node2;
        else
            head = node2;

        if (prev2 != null)
            prev2.next = node1;
        else
            head = node1;

        Node2 temp = node1.next;
        node1.next = node2.next;
        node2.next = temp;

        System.out.println("Nodes swapped successfully!");
        printList(head);
    }

    static void printList(Node2 head) {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node2 head = new Node2(10);
        head.next = new Node2(20);
        head.next.next = new Node2(30);
        head.next.next.next = new Node2(40);
        head.next.next.next.next = new Node2(50);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two values to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapNodes(head, a, b);
    }
}

