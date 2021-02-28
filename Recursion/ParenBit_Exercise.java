/*
* Given a string that contains a single pair of parenthesis,
* compute recursively a new string made of only of the parenthesis
* and their contents, so "xyz(abc)123" yields "(abc)".
* parenBit("xyz(abc)123") → "(abc)"
* parenBit("x(hello)") → "(hello)"
* parenBit("(xy)1") → "(xy)"
*/

package Recursion;

public class ParenBit_Exercise {

    public static void main(String[] args) {
        String str = "xyz(abc)123";
	    String answer = parenBit(str);

        System.out.println(str + " remove everything except the contents of the parentheses: " + answer);
    }

    public static String parenBit(String str) {
        if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
            return str;

        else if (str.charAt(0) == '(')
            return parenBit(str.substring(0, str.length()-1));

        else if (str.charAt(str.length()-1) == ')')
            return parenBit(str.substring(1));

        return parenBit(str.substring(1, str.length()-1));
    }
}

