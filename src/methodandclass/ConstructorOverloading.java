package methodandclass;

class Box{
    double width;
    double height;
    double dept;

    // Constructor use when all dimension specified
    Box (double w, double h, double d){
        this.width = w;
        this.height = h;
        this.dept = d;
    }
    // Constructor when no dimension is specified
    Box(){
        width = -1;
        height = -1;
        dept = -1;
    }

    // Constructor use when cube is constructed
    Box(double len){
        width = height = dept = len;
    }

    //Compute volume and return
    double volume(){
        return width * height* dept;
    }
}


class ConstructorOverloading {
    public static void main(String[] args){
        //Create boxes using the various constructors
        Box myBox1 = new Box(10,20,30);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);
        double vol;

        //get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume of myBox 1: " +vol);

        //get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume of myBox 2: " +vol );

        //get volume of third box or cube
        vol = myBox3.volume();
        System.out.println("Volume of cube 3: " +vol);
    }
}
