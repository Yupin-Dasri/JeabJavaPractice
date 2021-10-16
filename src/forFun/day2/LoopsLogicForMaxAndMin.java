package forFun.day2;

import java.util.Scanner;

public class LoopsLogicForMaxAndMin {
    public static void main(String[] args) {


        System.out.println("Enter some numbers: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt(); //if user put 1
        int max = number;

        while (number != 0){
            number = input.nextInt(); // keep getting number from the user

               if(number > max){
                   max = number;
               }

        }
        System.out.println("max value " + max);







    }
}
