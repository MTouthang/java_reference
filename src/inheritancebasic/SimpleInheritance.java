package inheritancebasic;

/**
 * A simple example of inheritance
 */

// create a super class
class A{
    int i, j;

    void showij(){
        System.out.println("i and j:" +i+ " and "+ j );
    }
}

// create a subclass by extending class A
class B extends A{
    int k;

    void showK(){
        System.out.println("K: " + k);
    }

    void sum(){
        System.out.println("i+j+k: " + (i+j+k));
    }
}


class SimpleInheritance {
    public static void main(String[] args) {
        A superObj = new A();
        B subobj = new B();

        // super class may be use by itself
        superObj.i = 10;
        superObj.j = 20;

        System.out.println("Content of the super class: ");
        superObj.showij();

        // The subclass has access to all public members of its superclass
        subobj.i = 7;
        subobj.j = 8;
        subobj.k = 9;

        System.out.println("Content of the suboj");
        subobj.showij();
        subobj.showK();

        System.out.println();
        System.out.println("The sum of i, j and k in subobj ");
        subobj.sum();
    }
}
