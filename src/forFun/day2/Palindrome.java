package forFun.day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //Palindrome is the word or a number that is same when you read from forward to backward

        //1112111, level, anna, 12344321
        System.out.println("Enter a number or a word: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String reverseName = "";

        for(int i = str.length()-1; i >= 0; i--){
            reverseName += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverseName)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }



    }
}
