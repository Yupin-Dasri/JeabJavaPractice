package javaPractice;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {

        List<Integer>  list = new ArrayList<>();
        list.addAll(Arrays.asList( 1,2,3,4,5,6,7,7,8,8,9,10));
        list.remove(3);
        System.out.println("list = " + list);
        list.remove(5);

       list.removeIf(p -> p < 8);


        Iterator<Integer>  it = list.iterator();
        while (it.hasNext()){
            if(it.next() < 8){
                it.remove();
            }

        }
        System.out.println(list);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jeab", "Jeab", "Jeab", "Nick","Nick", "Linda", "Rosie"));


        names.removeAll(Arrays.asList("Nick"));
        System.out.println("names = " + names);
//        names.removeIf(p-> p.equals("Jeab"));
//        System.out.println("names = " + names);
//
//        Iterator<String> n = names.iterator();
//
//        while (n.hasNext()){
//            String eachName = n.next();
//            if(eachName.equals("Jeab")){
//                n.remove();
//            }
//        }
//        System.out.println("names = " + names);
//
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,6,7,8,9));
//        numbers.remove(0);
//        numbers.remove(0);
//        System.out.println("numbers = " + numbers);
//
//        Iterator<Integer> it2 = numbers.iterator();
//        while (it2.hasNext()){
//            if(it2.next() < 10){
//                it2.remove();
//            }
//
//        }
//
//        System.out.println("numbers = " + numbers);
//

    }
}
