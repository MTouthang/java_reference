package methodandclass;


//Primitive types are pass by value
class Testing{
    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String [] args){
        Testing obj = new Testing();

        int a = 15, b = 20;
        System.out.println("a and b before call: "+ a+" " + b);

        obj.meth(a, b);
        System.out.println("a and b after call: "+ a+" " + b);

    }
}
