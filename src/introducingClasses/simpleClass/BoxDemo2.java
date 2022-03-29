package introducingClasses.simpleClass;

class Box2{
    double width;
    double height;
    double depth;
}

public class BoxDemo2 {
    public static void main(String[] args){
        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();
        double vol;

        //assign values to myBox1's instance variables
        myBox1.width=10;
        myBox1.height=20;
        myBox1.depth=15;

        //assign values to myBox2's instance variables
        myBox2.width=3;
        myBox2.height=6;
        myBox2.depth=9;

        //compute volume of the first box
        vol = myBox1.depth* myBox1.width*myBox1.height;
        System.out.println("Volume of the first box" + vol);

        //compute volume of the second box
        vol = myBox2.depth* myBox2.width* myBox2.height;
        System.out.println("Volume of the second box " + vol);
    }
}
