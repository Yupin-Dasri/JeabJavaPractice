package forFun.day1;

public class StringPractice {
    public static void main(String[] args) {

        //str1 & str2 & str5 is only one object sharing the same object
      String str1 = "hello";
      String str2 = "hello";

      String str3 = new String("hello"); // new object created in the memory
      String str4 = new String("hello");// another new object created in the memory
      String str5 = "hello";

      //the difference between the == and equals() in Java

        if(str1 == str2){
            System.out.println(" equal based on == ");
        }else {
            System.out.println(" not equal base on ==");
        }

        if(str1 == str5){
            System.out.println(" equal based on == ");
        }else {
            System.out.println(" not equal base on ==");
        }
        if(str1 == str3){
            System.out.println(" equal based on == ");
        }else {
            System.out.println(" not equal base on ==");
        }

        //=================================================================================

        if(str1.equals(str3)){
            System.out.println(" equal based on equal() ");
        }else {
            System.out.println(" not equal base on equal()");
        }

        if(str1.equals(str5)){
            System.out.println(" equal based on equal() ");
        }else {
            System.out.println(" not equal base on equal()");
        }

        //*****       == is check location on memory
        //*****       equals() check the value of only

    }
}
