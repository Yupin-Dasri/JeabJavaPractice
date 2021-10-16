package javaPractice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestingThrowKeyword {

    public static void main(String[] args)  {

       /* int num = 5;

        //Thread.sleep(3000);

        if (num > 7) {
            System.out.println("Number is Greater than 7");
        } else {
            System.err.println("number is less than 7");
           // throw new RuntimeException("Number is Less than 7");
        }

        System.out.println("f");

        */

        List<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(10,9,8,7,6,5));
        num.removeIf(p-> p <= 5);
        System.out.println(num);

        Iterator<Integer> it = num.iterator();

        while (it.hasNext()){
            if(it.next() < 8){
                it.remove();
            }
        }
        System.out.println(num);

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Jeab","Nick","Tim", "Linda","linda", "linda"));
        names.removeIf(name-> name.equalsIgnoreCase("linda"));
        System.out.println(names);
        names.add("Ning");
        names.remove("Tim");
        System.out.println(names);

        String[] groups = {"one", "two", "three", "two" };

        for(int i = 0; i < groups.length; i++){
            if (groups[i].equals("two")){
                groups[i] = "five";
            }
        }

        System.out.println("Replace two with five: " + Arrays.toString(groups));


        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            if(iterator.next().toString().equalsIgnoreCase("Ning")){
                iterator.remove();
            }
        }

        System.out.println(names);


    }
}
