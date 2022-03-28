package methodandclass.introducingtoaccesscontrol;

/**
 * This program demonstrates the difference between the difference
 * between private and public class
 */
class Test{
    int a; // default access
    public int b; //public access
    private int c; //private access

    // method to access c
    void setc(int i) {
        c = i;
    }
    // method to get c's value
    int getc(){
        return c;
    }
}



class TestAccess {
    public static void main(String[] args){
        Test ob = new Test();

        // These are ok a and b to access directly
        ob.a = 10;
        ob.b = 20;

        // This is not ok to access c directly
        //ob.c =100; error

        // the c must be access through its method
        ob.setc(100);
        System.out.println("The value a, b and c: " + ob.a +" "+ob.b+ " " + ob.getc());

    }
}
