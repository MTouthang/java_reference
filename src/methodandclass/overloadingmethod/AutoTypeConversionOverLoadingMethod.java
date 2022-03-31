package methodandclass.overloadingmethod;

// Automatic type conversions apply to overloading
class OverloadDemo{
    void Test(){
        System.out.println("No parameters");
    }
    void Test(int a){
        System.out.println("This is Test(integer) " +a);
    }

    // Overloading test for two Integer
    void Test(int a, int b){
        System.out.println("a and b: " +a +" and " +b);
    }

    // Overloading test for double integer
    void Test(double a){
        System.out.println("Inside test(double): "+a);
    }

}

class AutoTypeConversionOverLoadingMethod {
    public static void main(String[] args){
        OverloadDemo overObj = new OverloadDemo();
        int i = 88;

        overObj.Test();
        overObj.Test(10, 20);

        overObj.Test(i); // This will invoke Test (integer)
        overObj.Test(123.1); // This will invoke Test (double)
    }
}
