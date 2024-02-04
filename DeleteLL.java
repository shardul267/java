

class nnode {
    int data;
    node next;

    nnode(int data1, node next1) {
        this.data = data1;
        this.next = next1;
    }
    nnode(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class DeleteLL {

    private static node deleteTail(node head) {

        if (head == null || head.next == null)
            return null;

        node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    private static void printLL(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 7};
        node head = new node(arr[0]);
        head.next = new node(arr[1]);
        head.next.next = new node(arr[2]);
        head.next.next.next = new node(arr[3]);

        head = deleteTail(head);

        printLL(head);
    }
}

