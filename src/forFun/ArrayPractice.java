package forFun;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        int[] nums = {1,2,3,4,5,5,5,6,7,8,9};

        nums[1] = 100;
        System.out.println("nums = " + Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 5){
                nums[i] = 70;
            }
        }
        System.out.println(Arrays.toString(nums));


        int[] sortArr = {5,10,2,1,9,20,15,8,7,4};
        Arrays.sort(sortArr);

        System.out.println(Arrays.toString(sortArr));

        for(int i = 0; i <sortArr.length; i++){
            for (int j = i + 1; j < sortArr.length; j++){
                int temp = 0;
                if(sortArr[i] > sortArr[j]){
                    temp = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sortArr));
    }
}
