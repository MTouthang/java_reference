package introducingClasses.simpleClass;

// The Box class
class Box{
    double width;
    double height;
    double depth;
}

// This class declares an object of types Box.
public class BoxDemo {
    public static void main(String[] args){
        Box myBox = new Box();
        double vol;

        //Assign value to myBox's in instance variables
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        //Compute volume of the box
        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println("volume is " + vol);
    }
}


