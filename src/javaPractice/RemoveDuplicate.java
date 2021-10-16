package javaPractice;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String name = "nickkkkjeabbbbb";
        System.out.println("removeDup(name) = " + removeDup(name));

    }

    public static String removeDup(String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(!result.contains(str.charAt(i)+ "")){
                result += "" + str.charAt(i);
            }
        }
        return result;

    }
}
