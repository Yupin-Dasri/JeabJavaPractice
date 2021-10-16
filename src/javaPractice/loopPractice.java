package javaPractice;

import java.util.Arrays;

public class loopPractice {
    public static void main(String[] args) {


        String[] fruits = {"apple", "banana", "grapes"};
        String name = "Cybertek School";

        for (int i = 0; i < fruits.length; i++) {

            String[] arr = fruits[i].split("");

            int end = arr.length - 1;
            for (int start = 0; start < arr.length / 2; start++) {
                String temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                end--;

            }

            String rev = "";
            for (String each : arr) {
                rev += each;
            }

            fruits[i] = rev;
        }

        System.out.println(Arrays.toString(fruits));


//        for (int i = 0; i < fruits.length; i++) {
//
//            String rev = "";
//
//            for (int j = fruits[i].length() - 1; j >= 0; j--) {
//                rev += fruits[i].charAt(j);
//            }
//
//            System.out.print(rev + " ");
//
//
//        }
//        System.out.println();
//
//        String result = "";
//
//        for(int i = name.length()-1; i >=0; i--){
//            result += name.charAt(i);
//        }
//
//        System.out.println(result);
//
//        for(int i=0; i <10; i++){
//            if( i % 2 == 0){
//                System.out.print(i + " ");
//            }
//        }
//
//        System.out.println();
//        for(int i = 1; i < 20; i+=2){
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        for(int i = 1; i <=3; i++){
//            System.out.println();
//            for(int j = 1; j <= 3; j++){
//                System.out.print( "column " + j);
//
//            }
//        }

        int[] arr = {1,10,5,8,15};
        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr last index = " + arr[arr.length - 1]);
        for(int each: arr){
            System.out.print( each + ", ");
        }

    }
}
