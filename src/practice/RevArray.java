package practice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RevArray {
    public static void main(String[] args){

        System.out.println(frequencyOfChars("alaska")); // h1e1l2o1

        String names = "nickkkkjeabb";

        System.out.println("removeDup(names) = " + removeDup(names));

        String name2 = "aaabbbcccdddfffff";

        System.out.println("frequencyOfString(name2) = " + frequencyOfString(name2));
        LinkedHashSet<String> names3 = new LinkedHashSet<>(Arrays.asList(name2.split("")));
        System.out.println(names3);


    }

    // TODO: Find the duplicates in a Sting with Set

   public static String frequencyOfChars(String str){

        String nonDup = "";

        for(int i=0; i < str.length(); i++)
            if(!nonDup.contains(""+str.charAt(i)))
                nonDup+= ""+str.charAt(i);

         String expectedResult = "";

        for( int j=0;j < nonDup.length(); j++) {
            int count = 0;

            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult +=nonDup.charAt(j)+"" + count;
        }
        return expectedResult;
    }

    public static String removeDup(String arr){
        String result = "";

        LinkedHashSet<String> names = new LinkedHashSet<>(Arrays.asList(arr.split("")));

        for (String each : names) {
            result += each;
        }
        return result;
    }

    public static String frequencyOfString(String name){

        String nonDup = removeDup(name);
        String expectedResult = "";

        for(int i =0; i < nonDup.length(); i++){
            int count = 0;

            for(int j =0; j < name.length(); j++){
                if ( name.charAt(j) == nonDup.charAt(i)){
                    count++;
                }
            }
            expectedResult += nonDup.charAt(i)+"" + count;
        }
        return expectedResult;
    }
}
