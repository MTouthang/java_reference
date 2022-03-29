package methodandclass.nestedandinnerclass;

/**
 * Define inner  class within a for loop
 */

class OuterClass{
    int outer_x = 100;

    void test(){
        for (int i=0; i<10; i++){
            class Inner2{
                void display(){
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner2 inner = new Inner2();
            inner.display();
        }
    }

}
class InnerClassDemo2 {
    public static void main(String[] args) {
        OuterClass outer2 = new OuterClass();
        outer2.test();
    }
}
