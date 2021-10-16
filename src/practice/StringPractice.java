package practice;

public class StringPractice {
    public static void main(String[] args) {


        String str = "Java"; //immutable
               str.concat(" Language"); //"Java Language"

        System.out.println(str); //Java


        System.out.println("----------------------------------------------------------");

        StringBuilder sb1 = new StringBuilder("Java"); //mutable
                sb1.append( " Language"); //"Java Language" it will change we don't have to assign it again

        StringBuffer sb = new StringBuffer("Java"); //mutable and synchronized
        sb.append(" Language");

        System.out.println(sb1);//Java Language
        System.out.println(sb);//Java Language


    }
}
