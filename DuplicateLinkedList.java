import java.util.*;

class Node {
    int data;
    node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DuplicateLinkedList {

    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(2);
        head.next.next.next.next = new node(4);

        System.out.println("Original linked list:");
        printLinkedList(head);

        head = removeDuplicates(head);

        System.out.println("Linked list after removing duplicates:");
        printLinkedList(head);
    }

    public static node removeDuplicates(node head) {
        Set<Integer> seen = new HashSet<>();
        node current = head;
        node previous = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                previous.next = current.next;
            } else {
                seen.add(current.data);
                previous = current;
            }

            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(node head) {
        node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}