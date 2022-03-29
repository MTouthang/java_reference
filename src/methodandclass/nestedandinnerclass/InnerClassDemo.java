package methodandclass.nestedandinnerclass;

/**
 * Demonstrate inner class
 */
class Outer{
    int out_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    // this is the inner class
     class Inner {
        void display(){
            System.out.println("display: out_x = " + out_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }

}
