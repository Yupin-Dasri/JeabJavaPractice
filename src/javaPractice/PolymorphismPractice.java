package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PolymorphismPractice {
    public static void main(String[] args) {


        List<String> name = new LinkedList<>();
        name.addAll(Arrays.asList("Nick","Jeab","Linda", "Golf"));
        System.out.println(name);

        ((LinkedList)name).poll();
        System.out.println(name);
        ((LinkedList)name).poll();
        System.out.println(name);
        ((LinkedList<String>) name).push("Nichol");

        LinkedList<String> names2 = new LinkedList<>(Arrays.asList("Rosie","Khanh", "Tenzin"));
        names2.pop();
        System.out.println(names2);

        List<Integer> badNums = new ArrayList<>(Arrays.asList(2,3));

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,2,3,4,5,6));
        nums.removeAll(Arrays.asList(2
        ));

        System.out.println(nums);



    }
}
