package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {


        String name = "JeabJeabJeab";

        String[] eachLetter = name.split("");

        String nonDup = "";
        String expectedResult = "";
        for (String letter : eachLetter) {
            if (!nonDup.contains(letter)) {
                nonDup += letter;
            }
        }

        for (String each : nonDup.split("")) {
            int frequency = 0;
            for (String each2 : name.split(""))
                if (each.contains(each2)) {
                    frequency++;
                }

            expectedResult += each + frequency;
        }

        System.out.println(expectedResult);


//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for (char each : name.toCharArray()) {
//            if (!map.containsKey(each)) {
//                map.put(each, 1);
//            } else {
//                map.put(each, map.get(each) + 1);
//            }
//        }
//
//        System.out.println(map);
//
//        String result = "";
//
//        for (char key : map.keySet()){
//            result += key + "" + map.get(key);
//        }
//
//        System.out.println(result);

    }

}