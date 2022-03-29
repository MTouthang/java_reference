package methodandclass.exploringstring;

class StringDemo2 {
    public static void main(String[] args) {
        String obj1 = "First String";
        String obj2 = "Second String";
        String obj3 = obj1;

        System.out.println("Length of obj1: " + obj1.length());

        System.out.println("Char at index 3 of obj1: " + obj1.charAt(3));

        if (obj1.equals(obj2)){
            System.out.println("obj1 == obj2");
        }else {
            System.out.println("obj1 != obj2");
        }

        if (obj1.equals(obj3)){
            System.out.println("obj1 == obj3");
        }else {
            System.out.println("obj1 != obj3");
        }


    }
}
