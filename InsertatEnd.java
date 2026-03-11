
import java.util.Scanner;

class InsertatEnd{
    int size;
    int top;
    int arr[];
    InsertatEnd(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }


     void push(int data) {
        if (top == size - 1) {
            System.out.println("stack overflow");
            return;
        }
        arr[++top] = data;
    }
    int pop(){
        if(top==-1){
             System.out.println("underflow");
             return -1;
        }
        return arr[top--];
    }
    void display(){
        if(top==-1){
            System.out.println("empty stack");
            return;
        }
        for(int i=top;i>=0;i--){
                System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void pushElementEnd(int data){
       
        if(top==-1){
           this.push(data);
           return  ;
        }
        int temp = pop();

       
        pushElementEnd(data);

        push(temp);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the stack");
        int n = sc.nextInt();
        InsertatEnd stack=new InsertatEnd(n);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        stack.pushElementEnd(99);
        stack.display();
    }
}