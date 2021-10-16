package javaPractice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


        /*
        In this assignment
        you will write a program that will generate a shopping list.
         It's more advanced version of assignment Shopping list I.
         Your program should ask use to enter items followed by its price.
         After adding item, ask user if he wants to ass one more item.
         if so, repeat previous steps again. If no, print shopping list report and total price as show in examples.
         Your program should accept up to 10 items.

         */

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        do {
            System.out.println("Enter Item" + count + " and its price: ");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;

            shoppingListReport += "Item" + count+": " + item + "Price: " +  price ;

            System.out.println("Add one more item");

            countinue = scan.next();


            if(countinue.equalsIgnoreCase("yes")){
                shoppingListReport += ", ";
            }
            count++;

        } while (countinue.equalsIgnoreCase("yes") && count <= 10);

        System.out.println(shoppingListReport);
        System.out.println("totalPrice = " + totalPrice);

    }

}



















