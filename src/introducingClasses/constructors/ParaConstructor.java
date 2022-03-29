package introducingClasses.constructors;

class Box1 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box
    Box1(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //compute and return volume
    double volume(){
        return width* height* depth;
    }
}

public class ParaConstructor {
    public static void main(String[] args){
        Box1 myBox1 = new Box1(10, 20, 15);
        Box1 myBox2 = new Box1(3,6,9);
        double vol;

        //get volume of first box
        vol = myBox1.volume();
        System.out.println(vol);

        //get volume of sec box
        vol = myBox2.volume();
        System.out.println(vol);


    }
}
