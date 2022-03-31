package methodandclass.objectparams;

class Test2{
    int a, b;

    Test2(int i, int j){
        a = i;
        b = j;
    }

    void meth(Test2 obj){
        obj.a *= 2;
        obj.b /= 2;
    }
}

class PassObRef {
    public static void main(String[] args){
        Test2 obj = new Test2(15, 20);

        System.out.println("obj.a and obj.b before call "+ obj.a +" and " + obj.b);

        obj.meth(obj);
        System.out.println("obj.a and obj.b after call "+ obj.a +" and " + obj.b);

    }
}
