package methodandclass;

class Test{
    int a, b;

    Test(int i, int j){
        a=i;
        b=j;
    }
    // Return true if o is equal to the invoking object
    boolean equalTo(Test o){
        return o.a == a && o.b == b;
    }
}

class ObjectAsParams {
    public static void main(String[] args){
        Test obj1 = new Test(100,22);
        Test obj2 = new Test(100, 22);
        Test obj3 = new Test(-1, -1);

        System.out.println("obj1 == obj2 " + obj1.equalTo(obj2));
        System.out.println("obj2==obj3 " + obj1.equalTo(obj3));
    }
}
