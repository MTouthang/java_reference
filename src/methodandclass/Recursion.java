package methodandclass;

// simple example of recursion
class Factorial{

    // This is a recursive method
    int fact(int n){
        int result;

        if (n==1){
            return n;
        }else{
            result = fact(n-1) * n;
            return result;
        }
    }
}

class Recursion {
    public static void main(String[] args){
        Factorial fac = new Factorial();

        System.out.println("Print the factorial of 3: " + fac.fact(3));
        System.out.println("Print the factorial of 4: " + fac.fact(4));
        System.out.println("Print the factorial of 5: " +  fac.fact(5));
    }
}
