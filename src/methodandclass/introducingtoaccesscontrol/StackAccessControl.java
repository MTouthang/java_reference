package methodandclass.introducingtoaccesscontrol;


/**
 * This class defines an integer stack that can hold 1o values
 */
class Stack2{
    /*
    Now, both the stck and tos are private. This means
    that they cannot be accidentally or maliciously
    altered in a way that would be harmful to the stack
     */

    final int[] stck =new int[10];
    private int tos;

    // Initialize top-of-stack
    Stack2(){
        tos = -1;
    }

    // Push item into a stack
    void push(int item){
        if (tos == 9){
            System.out.println("stack is full");
        }else {
            stck[++tos] = item;
        }
    }

    // Pop item into a stack
    int pop(){
        if (tos<0){
            System.out.println("Stack is underflow");
            return 0;
        }else{
            return stck[tos--];
        }
    }

}

class StackAccessControl {
    public static void main(String[] args){
        Stack2 myStack1 = new Stack2();
        Stack2 myStack2 = new Stack2();

        // put some item into myStack1
        for (int i=0; i<10; i++){
            myStack1.push(i);
        }
        // put some item into myStack2
        for(int i =10; i<20; i++){
            myStack2.push(i);
        }

        // remove some item from myStack1
        System.out.println("Items of myStack1: ");
        for (int j=0; j<10; j++){
            System.out.println(myStack1.pop());
        }

        // remove some item from myStack2
        System.out.println("items of myStack2: ");
        for (int j=10; j<20; j++){
            System.out.println(myStack2.pop());
        }

        /*
        These statements are illegal
        myStack1.tos = -2;
        myStack1.stck[3] =100;
*/
    }
}
