package javaPractice;

public class CandyTea {

    public static void main(String[] args) {

        int res = candyTea(6, 60);
        System.out.println(res);

        String s1 = buzz(4);
        System.out.println(s1);
    }

    public static int candyTea(int candy, int tea) {

        if (candy >= 5 && tea >= 5){
            if(candy - tea >= tea || tea - candy >= candy){
               return 2;
            }else {
                return 1;
            }

        }else {
            return 0;
        }


    }

    public static String buzz(int n){

        if (n % 3 == 0 || n % 5 == 0){
            if(n % 3 == 0 && n % 5 ==0){
                return "buzz!";
            }else if(n % 5 == 0){
                return "hey";
            }else {
                return "hello";
            }
        }else {
            return n + "!";
        }
    }


}

