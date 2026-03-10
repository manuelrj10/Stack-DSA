
import java.util.Scanner;

class StacKArray {

    int size;
    int[] arr;
    int top;

    public StacKArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("stack overflow");
            return;
        }
        arr[++top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return;
        }
        System.out.println("removed element" + arr[top]);
        top = top - 1;

    }

    void peek() {
        if (top == -1) {
            System.out.println("empty");
            return;
        }
        System.out.println(arr[top]);

    }

    boolean iEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    void display() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    int size(){
        if (top == -1) {
            return -1;
        }
        
        return top+1;


    }
    void clear(){
        top=-1;
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the stack");
        int n = sc.nextInt();
        StacKArray stack = new StacKArray(n);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        stack.pop();
        stack.display();
        int count=stack.size();
        System.out.println(count);

    }
}
