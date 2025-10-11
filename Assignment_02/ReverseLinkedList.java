package Assignment_02;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// 1️⃣ Print all nodes of a singly linked list in reverse order

public class ReverseLinkedList {
    static void printReverse(Node head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Reverse order:");
        printReverse(head);
    }
}
