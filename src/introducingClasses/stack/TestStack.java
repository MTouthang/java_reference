package introducingClasses.stack;

class Stack{
    int[] stck = new int[10];
    int tos;

    // initialize top-of-stack
    Stack(){
        tos = -1;
    }

    // push item onto the stack
    void push(int item){
        if(tos==9){
            System.out.println("Stack is full");
        }else{
            stck[++tos] = item;
        }
    }

    //pop item from the stack
    int pop(){
        if (tos<0){
            System.out.println("Stack is underflow");
            return 0;
        }else {
            return stck[tos--];
        }
    }

}

public class TestStack {
    public static void main(String[] args){
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //add item in myStack1
        for(int i=0; i<10; i++){
            myStack1.push(i);
        }

        //add item in myStack2
        for (int i=10; i<20; i++){
            myStack2.push(i);
        }

        //pop or remove item from myStack1
        System.out.println("popping out stack1");
        for (int i=0; i<10; i++){

            System.out.println(myStack1.pop());
        }

        // pop or remove from myStack2
        System.out.println("popping out stack2");
        for (int i=0; i<10; i++){
            System.out.println(myStack2.pop());
        }

    }
}
