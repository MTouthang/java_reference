package methodandclass.objectparams;

class Box2{
    double width;
    double height;
    double dept;

    //Notice this constructor takes an object of type Box
    Box2(Box2 ob){ //pass object to construtor
        width = ob.width;
        height = ob.height;
        dept = ob.dept;
    }
    Box2(double w, double h, double d){
        width=w;
        height=h;
        dept = d;
    }

    //Constructor use when no dimension specified
    Box2(){
        width = -1; // -1 indicate an uninitialized box
        height = -1;
        dept = -1;
    }
    // Constructor used when cube is created
    Box2(double len){
        width=height=dept=len;
    }

    //compute and return volume
    double volume(){
        return width*height*dept;
    }


}

class BoxObject {
    public static void main(String[] args){
        //create boxes using the various constructors
        Box2 myBox = new Box2(10,20,30);

        Box2 myBox2 = new Box2();

        Box2 myBox3 = new Box2(7);
        Box2 myClone = new Box2(myBox);

        double result;

        //get volume of the first box
        result = myBox.volume();
        System.out.println("The volume of the first mybox: " + result);

        //get volume of the second box
        result  = myBox2.volume();
        System.out.println("The volume of the myBox2: " + result);

        //get volume of the third box
        result = myBox3.volume();
        System.out.println("The volume of the myBox3: "+result);

        //get volume of the cube box
        result = myClone.volume();
        System.out.println("The volume of myClone: " +result);
    }
}
