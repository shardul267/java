
import java.util.*;
class Stack {


    int size;


    int top;


    int[] a;


    boolean isEmpty()
    {
        return (top < 0);
    }


    Stack(int n)
    {
        top = -1;
        size = n;
        a = new int[size];
    }


    boolean push(int x)
    {


        if (top >= size) {
            System.out.println(
                    "Stack Overflow");
            return false;
        }
        else {


            a[++top] = x;
            return true;
        }
    }


    int pop()
    {

        // If stack is empty
        if (top < 0) {
            System.out.println(
                    "Stack Underflow");
            return 0;
        }

        // Pop element from stack
        else {
            int x = a[top--];
            return x;
        }
    }
}


class arrayusingstack {


    public static void reverse(int arr[], int n)
    {


        Stack obj = new Stack(n);

        for (int i = 0; i < n; i++) {


            obj.push(arr[i]);
        }


        for (int i = 0; i < n; i++) {


            arr[i] = obj.pop();
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String args[])
    {
        int n = 4;


        int[] a = new int[] { 100, 200, 300, 400 };


        reverse(a, n);
    }
}

