package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveWord {
    public static void main(String[] args) {

        String name = "Cybertek is a good school cybertek";

        name = name.toLowerCase().replace("cybertek", "Nova");
        name = name.replaceFirst("Nova", "Love");
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name);



        String catDog = "cat dog cat dog dog dog";
        int countDog = 0;

       while(catDog.contains("dog")){
           catDog = catDog.replaceFirst("dog","");
           countDog++;
       }

        System.out.println(countDog);

//        String [] names = {"Ayush", "Ayush", "John", "Yupin", "Mihailo"};
//
//        ArrayList<String> name2 = new ArrayList<>(Arrays.asList(names));
//       // name2.removeIf(p -> p.contains("Yupin"));
//        name2.removeAll(Arrays.asList("Ayush"));
//        System.out.println(name2);

       String practiceNames = "jeab like to eat rice";
        String revertStr = "";

        for(int i = practiceNames.length()-1; i >= 0; i--){
            revertStr += practiceNames.charAt(i)+ "";
        }
        System.out.println(revertStr);

        StringBuffer reverse3 = new StringBuffer(revertStr);
        System.out.println(reverse3.reverse());

        String sentence = "I love you to the moon";
        String revertSentence = "";
        for( int i = sentence.length()-1; i >= 0; i--){
            revertSentence += sentence.toCharArray()[i];
        }

        System.out.println(revertSentence);

    }
}
