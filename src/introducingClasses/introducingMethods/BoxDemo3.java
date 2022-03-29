package introducingClasses.introducingMethods;

class Box{
    double width;
    double height;
    double depth;

    //display volume of a box method
    void volume(){
        System.out.println("volume is ");
        System.out.println(width*height*depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args){
        Box2 myBox12 = new Box2();
        Box2 myBox22 = new Box2();

        //assign values to myBox1's instance variable
        myBox12.width=10;
        myBox12.height=20;
        myBox12.depth=15;

        //assign values to myBox2's instance variable
        myBox22.width=3;
        myBox22.height=6;
        myBox22.depth=9;

        //display volume of first box
        myBox12.volume();

        //display volume of second box
        myBox22.volume();

    }
}
