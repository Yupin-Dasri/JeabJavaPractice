package forFun.day2;

public class FibonacciNumbers {
    public static void main(String[] args) {

        //1 2 3 5 8 13 21 34

       /* int sum = 0;
        int a = 0;
        int b = 1;



        for(int i = 1; i < 10; i++ ){

            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }

        */

        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i = 0; i < 10; i++){

            sum = a+b;
            a = b;
            b = sum;
            System.out.print(sum + " ");

        }

        System.out.println();

        int[] nums = {1,2,3,4,5,6,7,7,8,11,0};
        int max = nums[0];
        
        for(int each : nums){
            if(each > max){
                max = each;
            }
        }
        System.out.println("max = " + max);

        String words = "AAbbccddeeff";
        String result = "";

        for(String each: words.split("")){
            if(!result.contains(each)){
                result += each;
            }
        }
        System.out.println(result);


    }
}
