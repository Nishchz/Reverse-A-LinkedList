public class Reverse {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // Add node at end
    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Print Linked List
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse Linked List (Iterative)
    public static void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;   // Step 1
            curr.next = prev;   // Step 2
            prev = curr;        // Step 3
            curr = next;        // Step 4
        }

        head = prev;
    }

    // Main Method
    public static void main(String[] args) {

        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        System.out.println("Original List:");
        printList();

        reverse();

        System.out.println("Reversed List:");
        printList();
    }
}