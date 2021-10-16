package forFun.day2;

import sun.plugin.javascript.navig.Link;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class MapPractice {
    public static void main(String[] args) {

        String str = "aavvbbbcccccnnmlo";

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for(String each: str.split("")){
            int f = Collections.frequency(Arrays.asList(str.split("")), each);
            map.put(each,f);
        }
        System.out.println(map);


    }
}
