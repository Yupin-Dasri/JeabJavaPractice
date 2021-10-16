package forFun.day1;

public class ReplaceCharFromString {
    public static void main(String[] args) {
        
        // replace the char with a new char
        
        String str1 = "hello hello";
        String str2 = str1.replaceAll("e", "o");
        System.out.println("str2 = " + str2);
        
        int length = str1.length();
        System.out.println("length = " + length);

        char charOfIndex = str1.charAt(0);
        System.out.println("char of index 0 is " + charOfIndex);


        //concatenating strings
        String str3 = "Love You";
        String mixString = str1 + str3;
        System.out.println(" mix string = " +  mixString);

        //substring(beginIndex, endsIndexButNotIncluded)

        
        
    }
}
