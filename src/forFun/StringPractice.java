package forFun;

public class StringPractice {
    public static void main(String[] args) {


        String name = "Yupin";
        name = name.concat(" Dasri");
        System.out.println("name = " + name);

        System.out.println("name.startsWith(\"Y\") = " + name.startsWith("Y"));
        int valueOfP = name.indexOf("p");
        System.out.println(valueOfP);

        String str = "aaaabbbbccaaaa";
        String[] str2 = str.split("");


        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }
        System.out.println(result);

        for(String each : result.split("")){
            int frequencyOfChar = 0;
            for(String each2 : str.split("")){
                if(each.equals(each2)){
                    frequencyOfChar++;


                }
                result = result + frequencyOfChar;
            }

        }
        System.out.println("result = " + result);
    }
}
