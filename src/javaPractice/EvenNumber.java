package javaPractice;

public class EvenNumber {
    public static void main(String[] args) {


        for(int i = 1; i <=10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }



        System.out.println(lastTwo("Test"));



    }
    public static String lastTwo(String str) {

        int beforeLast = str.length()-2;

        return str.substring(beforeLast);

    }
}
