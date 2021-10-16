package forFun.day2;

public class PrimeNumbers {
    public static void main(String[] args) {

        //Prime number is the number that divisible only by 1 and by itself
        //prime number start with 2 and so on


        int limit = 50;

        for(int number = 2; number < limit ; number++){
            boolean isPrime = true;

                for(int divisor = 2; divisor < number; divisor++){
                    if(number % divisor == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.print(number + " ");
            }
        }
        System.out.println();




        /*

        int numberOfPrime = 50; //we want to find first 50 number of prime number
        int count = 0; //will increase if a number is prime
        int number = 2; // a number to be tested for the primeness

        while (count < numberOfPrime){
            boolean isPrime = true;
            for(int divisor = 2; divisor < number; divisor++){
                if(number % divisor == 0 ){ // if the number is not zero, it is not prime
                    isPrime = false;        // boolean will be false
                    break;
                }
            }
            if(isPrime){ //after the inner loop, if isPrime is still true, print out the number and increase the count
                System.out.print(number + " ");
                count++;
            }
            number++; // increase the number to be able to test the next number's primeness
        }



         */

/*
        for(int i = 2; i < limit ; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(i + " ");
            }
        }


 */

        int num = 5;

        String res = "Prime Number";

        if(num == 1){
            res = "not a prime number";
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                res = "not a prime number";
            }
        }

        System.out.println("res = " + res);


    }
}
