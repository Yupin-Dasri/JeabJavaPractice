package javaPractice;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetPractice {
    public static void main(String[] args) {


        LinkedHashMap<String , Integer> students = new LinkedHashMap<>();
        students.put("A", 85);
        students.put("B", 75);
        students.put("C", 95);

        for (String eachKey : students.keySet()) {
            System.out.println("eachKey = " + eachKey + " : " + students.get(eachKey));
        }
        for (Integer eachValue : students.values()) {
            System.out.println("eachValue = " + eachValue);
        }

        System.out.println("=====================================================================");

        for( Map.Entry<String,Integer> each :students.entrySet()){
            String eachKey = each.getKey();
            int eachValue = each.getValue();

            System.out.println(eachKey + " : " + eachValue);

        }


        Hashtable<String,Integer> nums = new Hashtable<>();

        nums.put("Nick", 90);
        nums.put("Linda", 70);
        nums.put("Jeab", 80);
        System.out.println("nums = " + nums);

        System.out.println("primNum(15) = " + primNum(5));


        StringBuilder names = new StringBuilder("I love eating");
           

        System.out.println("names = " + names);
        
        String firstName = "yupin";
        firstName = firstName.toUpperCase();
        boolean startWith = firstName.equals("Y");
        System.out.println("firstName.startsWith(\"y\") = " + firstName.startsWith("y"));
        System.out.println("firstName = " + firstName);

        int apple = 1;

        while( apple <= 5 ){

            System.out.println("Eating an apple");
            apple++;
        }
        System.out.println("No more apples");

        int num = 0;
        while (num <= 50){
            System.out.print( num+ ", " );
            num+= 5;
        }
        System.out.println();
        int num2 = 0;
        while (num2 <= 20){
            System.out.print( num2+ ", " );
            num2+= 2;
        }

    }
    public static String primNum(int num){

        if(num <2) return num + " is not a prime number";

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return num + " is not a prime number";
            }

        }
        return num + " is a prime number";




    }


}
