import java.util.Stack;
class ReverseElementStack{
   
    public static void main(String args[]){
        Stack<Integer> newStack=new Stack<>();
        Stack<Integer> oldStack=new Stack<>();

        oldStack.push(10);
        oldStack.push(20);
        oldStack.push(30);
        System.out.println(oldStack);
       while (!oldStack.isEmpty()) {
            int num = oldStack.pop();
            newStack.push(num);
        }
        System.out.println(newStack);


    }
}