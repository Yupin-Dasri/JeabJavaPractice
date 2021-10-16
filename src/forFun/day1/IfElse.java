package forFun.day1;

public class IfElse {
    public static void main(String[] args) {



        if(2==5){
            System.out.println("Hello");
        }else {
            System.out.println("2 not equal to 5");
        }

        int apple = 5;
        int orange = 10;

        //write in one line of condition statement
        System.out.println(apple > orange? "apple wins" : "Orange wins");

        int score = 90;

        if(score >= 90)
            System.out.println("A");
        else if(score  >= 80)
            System.out.println("B");
        else if(score >= 70)
            System.out.println("C");
        else
            System.out.println("D");


    }
}
