public class LinkedListInsertionAndTraversion {

    public static void main(String[] args) {

        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);

    }

}
class Solution {
    public void printReverse(Node node) {
        if (node == null) {
            return;
        }
        printReverse(node.next);
        System.out.print(node.data + " ");
    }
}

class Finder {
    public int[] countEvenOdd(Node head) {
        int evenCount = 0;
        int oddCount = 0;
        Node current = head;

        while (current != null) {
            if (current.data % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            current = current.next;
        }

        return new int[] { evenCount, oddCount };
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
