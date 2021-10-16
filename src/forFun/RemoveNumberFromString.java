package forFun;

public class RemoveNumberFromString {
    public static void main(String[] args) {

/*
        String random = "123 I LOVE YOU 456 aaabbcc";
      //  random =  random.replaceAll("[0-9]", "");
        random = random.replaceAll("[A-Z]", "") ;
        random = random.replaceAll(" ", "");
        random = random.replaceAll("[a-z]", "");
        System.out.println(random);

 */
        String str = "1234568HelloWorld";
        String result = "";

        char[] charArr = str.toCharArray();

        for(int i = 0; i < charArr.length; i++){
            if(!Character.isDigit(charArr[i])){
                result +=  charArr[i];
            }
        }

        System.out.println(result); // HelloWorld


        String onlyDigits = "";
        for(int i = 0; i <str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                onlyDigits += str.charAt(i);
            }
        }
        System.out.println(onlyDigits);
    }
}
