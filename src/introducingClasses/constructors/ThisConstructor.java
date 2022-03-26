package introducingClasses.constructors;

class Box4 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box
    Box4(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    //compute and return volume
    double volume(){
        return width* height* depth;
    }
}

public class ThisConstructor {
    public static void main(String[] args){
        Box4 myBox1 = new Box4(10, 20, 15);
        Box4 myBox2 = new Box4(3,6,9);
        double vol;

        //get volume of first box
        vol = myBox1.volume();
        System.out.println(vol);

        //get volume of sec box
        vol = myBox2.volume();
        System.out.println(vol);


    }
}
