package forFun;

import java.util.*;

public class StringUsingMap {

    public static  void main(String[] args) {


        String str = "aabbB1234";
        String[] arr = str.split("");
        System.out.println("arr = " + Arrays.toString(arr));

//        String removeLettersOnly = str.replaceAll("\\D", "");
//        String removeNumbersOnly = str.replaceAll("\\d", "");
//
//        System.out.println("removeLettersOnly = " + removeLettersOnly);
//        System.out.println("removeNumbersOnly = " + removeNumbersOnly);

       LinkedList<Integer> numbers = new LinkedList<>();
       numbers.addAll(Arrays.asList(1,2,3,4,5,6,null, null));
        System.out.println("numbers.getLast() = " + numbers.getLast());
        numbers.set(1,200);
        System.out.println("numbers = " + numbers);


        numbers.pop();
        numbers.pop();
        numbers.poll();

        System.out.println("numbers = " + numbers);

        Stack<String> names = new Stack<>();
        names.addAll(Arrays.asList("Jeab", "Nick","Linda","Ning","Rosie"));
        names.pop();
        System.out.println("names = " + names);

        LinkedList<String> name2 = new LinkedList<>(names);

        //name2.pop();
      //  name2.poll();
        System.out.println("name2 = " + name2);

        List<String> newNames = new ArrayList<>(Arrays.asList("Rosie","Vince", "Tony"));




        System.out.println(newNames);

        HashMap<String, String> listName = new HashMap<>();
        listName.put("Yupin", "Dasri");
        listName.put("Yupin", "Dasri");
        listName.put("Nick", "Woolsey");
        listName.put(null, null);
        listName.put("Linda", null);
        listName.put("Mike", null);
        System.out.println("listName = " + listName);


//       // newNames.remove(0);
//        System.out.println("newNames = " + newNames);
//        newNames.retainAll(Arrays.asList("Ning"));
//
//        System.out.println("newNames = " + newNames);

        System.out.println();

    }
}
