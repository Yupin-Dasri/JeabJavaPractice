package javaPractice;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Integer> employees = new LinkedHashMap<>();
        employees.put("Jeab", 120000);
        employees.put("Nick", 130000);
        //employees.values().forEach( p -> System.out.println("salary = " + p));

        for(Integer each : employees.values()){
            System.out.println("each = " + each); //
        }

        //each = 120000
        //each = 130000

       // System.out.println("employees = " + employees);

        List<Integer> salaries = new ArrayList<>(employees.values());
        System.out.println("salaries = " + salaries);

        //salaries = [120000, 130000]
        TreeMap<String,Integer> names = new TreeMap<>();
        names.putAll(employees);
        System.out.println("names = " + names);

        String str = "abbdidaaaacbbhbjbbdeeefff";
       Set<String> list = new LinkedHashSet<>(Arrays.asList(str.split("")));  //[a,b,c,d,e,f]
        System.out.println("list = " + list);


        Map<String, Integer> result1 = new LinkedHashMap<>();
        Map<String, Integer> result2 = new LinkedHashMap<>();

        for(String each : list){
            int f = Collections.frequency(Arrays.asList(str.split("")),each);
            if(f >1){
                result1.put(each,f);
            }else {
                result2.put(each, 1);
            }

        }

        System.out.println("duplicate  = " + result1);
        System.out.println("unique  = " + result2);


    }
}
