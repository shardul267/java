class node {
    int data;
    node next;
    node(int data1, node next1){
        this.data=data1;
        this.next=next1;
    }
    node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class LengthLL{

    private static int lengthofaLL(node head){
        int cnt=0;
        node temp=head;

        while(temp!=null){
            temp = temp.next;
            cnt++;// increment cnt for every node traversed
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[]arr={2,5,8,7};
        node head = new node(arr[0]);
        head.next= new node(arr[1]);
        head.next.next= new node(arr[2]);
        head.next.next.next= new node(arr[3]);
        // Print the length of the linked list
        System.out.println(lengthofaLL(head));
    }
}
