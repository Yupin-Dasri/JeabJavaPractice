package practice;


class A{
    static int a = 10;
    int b = 20;

    public static void main(String[] args) {

    }

    static{

    }
    static  class AA{ // inner class


    }

}



public class Static {

    public static void main(String[] args) {
        System.out.println(A.a); // calling static
        System.out.println(new A().b) ; //calling instance you have to create an object


        A.a = 30;

        A obj1 = new A();
        A obj2 = new A();
        obj1.b = 100;

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        System.out.println(obj2.b);


    }
}
