package methodandclass.arrayrevisited;

/**
 * Improve stack class that uses the length array member.
 */

class Stack{
    final int[] stack;
    private int tos;

    // allocate and initialize stack
    Stack(int size){
        stack = new int[size];
        tos = -1;
    }
    // getting the size of the stack
    public int getSize(){
        return stack.length;
    }

    // method to push item onto stack
    public void push(int item){
        if (tos == stack.length-1){
            System.out.println("The stack is full");
        } else {
            stack[++ tos] = item;
        }
    }
    // method to pop item from stack
    public int pop(){
        if (tos < 0){
            System.out.println("Stack is under flow");
            return 0;
        }else{
            return stack[tos--];
        }
    }
}

class StackLength {
    public static void main(String[] args){
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);


        // push some item in the myStack1 and myStack2
        for(int i=0; i<myStack1.getSize(); i++){
            myStack1.push(i);
        }
        for (int j=0; j<myStack2.getSize(); j++){
            myStack2.push(j);
        }

        // pop item from myStack1 and myStack2
        System.out.println("items from myStack1");
        for (int i = 0; i<myStack1.getSize(); i++){
            System.out.println(myStack1.pop());
        }
        System.out.println("items from myStack2");
        for (int j = 0; j<myStack2.getSize(); j++){
            System.out.println(myStack2.pop());
        }
    }
}
