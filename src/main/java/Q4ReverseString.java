// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string
        if(s.isEmpty()){
        return s;
    }
    return reverse(s.substring(1)) + s.charAt(0);
}
public static void main(String[] args) {
    String s = "test string";
    String reversedStr = reverse(s);
    System.out.println(reversedStr);
}
}
