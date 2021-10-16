package javaPractice;

import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {

        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        isPrime(arr);

        System.out.println("number is prime or not = " + primeNum(15));

        LinkedHashSet<String> name = new LinkedHashSet<>();
        name.add("Jeab");
        name.add("Vince");
        name.addAll(Arrays.asList("Nick", "Linda", "Rosie", "Khanh"));
        System.out.println("name = " + name);


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,2,3,4,5));

                numbers.add(0,1000);
                numbers.remove(5);
                numbers.add(2, 50);
                numbers.set(1, 200);
        System.out.println("numbers = " + numbers);
        numbers.removeAll(Arrays.asList(2));
        System.out.println("numbers = " + numbers);

        List<Integer>  counts = new Stack<>();
        counts.addAll(Arrays.asList(1,2,3,3,3,4,5));

        ((Stack)counts).pop();
        System.out.println("counts = " + counts);


        String str = "aaabbccccdddddd";
        String result = "";

       for(String each :  new LinkedHashSet<>(Arrays.asList(str.split("")))) {
           int  f = Collections.frequency(Arrays.asList(str.split("")),each);
           result += each + f;

        }

        System.out.println("result = " + result);

       LinkedList<Integer> numbers4 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("numbers4.getFirst() = " + numbers4.getFirst());
        System.out.println("numbers4.getLast() = " + numbers4.getLast());
     numbers4.poll();
        System.out.println("numbers4 = " + numbers4);
        Queue<Integer> int1 = new PriorityQueue<>(numbers4);
        int1.add(100);
        System.out.println("int1 = " + int1);



    }

    public static void isPrime(int[] arr) {
        for (int n : arr) {

            boolean isPrime = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (n > 1 && isPrime) {
                System.out.println(n);
            }

        }
    }

    public static boolean primeNum(int num){
        if(num < 2) return false;

        for(int i = 2; i < num; i++) {

            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }




}
