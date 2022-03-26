package introducingClasses.introducingMethods;

class Box3{
    double width;
    double height;
    double dept;

    //compute and return volume
    double volume(){
        return width*height*dept;
    }

    //set dimension of the Box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        dept = d;
    }
}

public class ParameterizeMethod {
    public static void main(String args[]){
        Box3 myBox1 = new Box3();
        Box3 myBox2 = new Box3();
        double vol;

        // initialize each box with setDim method
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        // get volume of the first box
        vol = myBox1.volume();
        System.out.println("The first volume of the box " + vol);

        // get volume of the second box
        vol = myBox2.volume();
        System.out.println("The second volume of the box " + vol);
    }
}
