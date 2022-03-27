package methodandclass;
//Demonstrate method overload

class OverloadMethod{

    void Test(){
        System.out.println("No parameter");
    }

    // Overload test for one integer parameter
    void Test(int a){
        System.out.println("a: "+a);
    }

    // Overload test for two integer as parameter
    void Test(int a, int b){
        System.out.println("a and b :" + a + " " + b);
    }

    // Overload test for double test parameter
    double Test(double a){
        return a*a;
    }
}


class OverloadingMethods {
    public static void main(String[] args){
        OverloadMethod overObj = new OverloadMethod();
        double result;

        // call all version of test method
        overObj.Test();
        overObj.Test(10);
        overObj.Test(10, 20);

        result = overObj.Test(123.5);
        System.out.println("Result of test (123.5):" + result);
    }
}
