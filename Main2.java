//практика 2
public class Main2 {
    public static void main2(String[] args){
        System.out.println(duplicateChars("Donald"));
        System.out.println(duplicateChars("orange"));
        System.out.println();
    }
    public static boolean duplicateChars(String s){
        boolean statement = false;
        String s1 = s.toLowerCase();
        for (int i = 0; i < s1.length(); i++){
            for (int j = i + 1;j < s1.length(); j++){
                if (s1.charAt(i) == s1.charAt(j)){
                    statement = true;
                    break;
                }
            }
        }
        return statement;
    }
}
