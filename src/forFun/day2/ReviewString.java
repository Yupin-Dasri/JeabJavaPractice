package forFun.day2;

import java.util.Scanner;

public class ReviewString {
    public static void main(String[] args) {


        /*
         * Suppose a string string contains the first name and last name separated by a
         * space. Write a code that separates the first name and last name.
         *
         * Example: Enter first name and last name: Py Charm
         * Py
         * Charm
         *
         * Tip: string.indexOf(' ’) >> returns the index of white space
         *
         */

        System.out.println("Enter your first name and last name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        //Yupin Dasri to separate I need to do a string manipulation

        int indexOfSpace = name.indexOf(' ');
        String firstName = name.substring(0, indexOfSpace);
        String lastName = name.substring(indexOfSpace + 1);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);




    }
}
