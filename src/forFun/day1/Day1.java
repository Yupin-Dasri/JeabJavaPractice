package forFun.day1;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

    /*    System.out.println("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int sum = 0;

        //987
        sum += number % 10; // sum = 7
        number = number / 10; //98
        sum += number % 10; // sum = 15
        number /= 10; // 9

        sum += number; // 24
        
        System.out.println(sum); //24
        
        


     */
        
        //ComputeChange

        System.out.println("Enter an amount: ");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble(); //11.56
        
        int newNumber = (int) (num * 100); // it give me the cent value of the money = 1156
        
        // one dollar
        int oneDollars = newNumber / 100;


        //remove the one dollars from the number
        newNumber = newNumber % 100; // 56 cents

        int quarters = newNumber / 25; // 2

        //remove the quarters from the number
        newNumber = newNumber % 25; // 6 cents

        //find the dimes
        int dimes = newNumber / 10; // 0

        // remove the dimes from the number(10 cents)
        newNumber = newNumber % 10; // 6 cents

        //find the nickels
        int nickels = newNumber / 5; // will return 1

        //remove nickles for the number(5 cents)
        newNumber = newNumber % 5; //return 1
        //remove the nickles
       int pennies = newNumber ;  // 1 cent

        System.out.println("oneDollars = " + oneDollars);
        System.out.println("quarters = " + quarters);
        System.out.println("dimes = " + dimes);
        System.out.println("nickels = " + nickels);
        System.out.println("pennies = " + pennies);







        


    }
}
