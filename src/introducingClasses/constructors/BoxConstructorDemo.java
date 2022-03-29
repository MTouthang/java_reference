package introducingClasses.constructors;
/* Here, Box uses a constructor to initialize the dimensions
   of the Box
 */
class Box{
    double width;
    double height;
    double dept;

    // This is the constructor of the box
    Box() {
        System.out.println("Inside the constructor of the box");
        width = 10;
        height = 10;
        dept = 10;
    }

    // compute and return the volume
    double volume(){
       return width*height*dept;
    }
}

public class BoxConstructorDemo {
    public static void main(String[] args){
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // get volume of the first box
        vol = myBox1.volume();
        System.out.println("Volume is " + vol );

        // get volume of the second box
        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}
