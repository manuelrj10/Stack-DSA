
import java.util.Stack;


class DuplicateElement{
  
    public static void main(String args[]){
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        
          
        if(stack.isEmpty()){
            System.out.println("empty satck");
            return;
        }
        int num=stack.peek();
        stack.push(num);
        System.out.println(stack);
        
    
    }


      


    }
