package introducingClasses.introducingMethods;

class Box2 {
    double width;
    double height;
    double depth;

    //display volume of a box method
    double volume(){
      return width*height*depth;
    }
}

public class BoxDemo4 {
    public static void main(String args[]){
        Box2 myBox12 = new Box2();
        Box2 myBox22 = new Box2();
        double vol;

        //assign values to myBox1's instance variable
        myBox12.width=10;
        myBox12.height=20;
        myBox12.depth=15;

        //assign values to myBox2's instance variable
        myBox22.width=3;
        myBox22.height=6;
        myBox22.depth=9;

        // get volume of the first box
        vol = myBox12.volume();
        System.out.println("Volume of the first box " + vol);

        // get volume of the second box
        vol = myBox22.volume();
        System.out.println("Volume of the second box" + vol);


    }
}
