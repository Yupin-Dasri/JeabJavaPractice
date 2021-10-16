package javaPractice;


import java.util.Arrays;

public class InterviewJava {

    public static void main(String[] args) {

        int[] numArr = {10,100, 80, 20, 30, 90, 70, 60, 50};
        findMaxNum(numArr);
        findSecondMaxNum(numArr);
        sortArray(numArr);

    }

    // TODO: Create two different methods. One will find that max of the array. Another will find the second max number

    public static void findMaxNum(int[] arr) {

        int max = arr[0];

        for (int each : arr) {
            if (max < each) {
                max = each;
            }
        }
        System.out.println("max number is = " + max);

    }

    public static void findSecondMaxNum(int[] arr) {

//        Arrays.sort(arr);
//        System.out.println("secondMax is " + arr[arr.length - 2]);
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int each : arr) {
            if (max < each) {
                max = each;
            }
        }
        System.out.println("max = " + max);

        for (int each : arr) {
            if (secMax < each && each < max) {
                secMax = each;
            }
        }
        System.out.println("secMax is = " + secMax);
    }

    public static void sortArray(int[] arr){

        int[] sortArr = new int[arr.length];

        int index = 0;

        for(int each : arr){
            for(int each2 : arr){
                if(each > each2){
                    sortArr[index++] += each;
                }
            }
        }
        System.out.println("sortArr = " + Arrays.toString(sortArr));



    }
}
