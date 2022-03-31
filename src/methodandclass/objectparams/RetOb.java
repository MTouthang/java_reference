package methodandclass.objectparams;

class TestReturnObj{
    int a;

    TestReturnObj(int i){
        a = i;
    }
    TestReturnObj incrByTen(){
        TestReturnObj temp = new TestReturnObj(a+10);
        return temp;
    }

}


class RetOb {
    public static void main(String[] args){
        TestReturnObj obj = new TestReturnObj(2);
        TestReturnObj obj2;

        obj2 = obj.incrByTen();
        System.out.println("obj1.a :" + obj.a);
        System.out.println("obj2.a :" + obj2.a);

        obj2 = obj2.incrByTen();
        System.out.println("obj2.a after the second increased: " +obj2.a);
    }
}
