package forFun.day2;

public class Loops {
    public static void main(String[] args) {

        //while loop
       int num = 1;

       while (num <=10){
           System.out.println(num);
           num++;
       }

        System.out.println("=====================================");
       int helloNum = 1;
       while (helloNum <=5){
           System.out.println("Hello");
           helloNum++;
       }
        System.out.println("=====================================");
       int sum = 0;
       int number = 1;
       while (number < 10){
           sum += number;
           number++;
       }
        System.out.println(sum);

       //for loop
        System.out.println("=====================================");
       for (int i = 1; i <= 5; i++){
           System.out.println("Love you");
       }

        System.out.println("=====================================");

       for(int i = 1; i <=10; i++){
           System.out.println(i);
       }

        System.out.println("=====================================");
       for(int i = 10; i >= 1; i-- ){
           System.out.println(i);
       }






    }
}
