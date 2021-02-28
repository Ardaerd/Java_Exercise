/*
* Given a string and a non-empty substring sub, compute recursively
*  if at least n copies of sub appear in the string somewhere,
*  possibly with overlapping. N will be non-negative.
* strCopies("catcowcat", "cat", 2) → true
* strCopies("catcowcat", "cow", 2) → false
* strCopies("catcowcat", "cow", 1) → true
*/

package Recursion;

public class StrCopies_Exercise {

    public static void main(String[] args) {
        String str = "catcowcat";
        String sub = "cat";
        System.out.println(str + " contains " + sub + " two times: " + strCopies(str, sub, 2));
    }

    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0)
            return true;

        else if (str.length() < sub.length())
            return false;

        else if (str.substring(0, sub.length()).equals(sub))
            return strCopies(str.substring(1), sub, n-1);

        return strCopies(str.substring(1), sub, n);
    }
}
