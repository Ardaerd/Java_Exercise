/*
* Given a string and a non-empty substring sub,
* compute recursively the largest substring which starts
* and ends with sub and return its length.
* strDist("catcowcat", "cat") → 9
* strDist("catcowcat", "cow") → 3
* strDist("cccatcowcatxx", "cat") → 9
 */

package Recursion;

public class StrDist_Exercise {

    public static void main(String[] args) {
        String str = "cccatcowcatxx";
        String keyWord = "cat";
        int result = strDist(str, keyWord);

        System.out.println(str + " There are " + result + " words between two cat keyword.");
    }

    public static int strDist(String str, String sub) {
        if (str.length() < sub.length())
            return 0;

        else if (str.substring(0, sub.length()).equals(sub) &&
                str.substring(str.length()-sub.length(), str.length()).equals(sub))
            return str.length();

        else if (str.substring(0,sub.length()).equals(sub))
            return strDist(str.substring(0, str.length()-1), sub);

        return strDist(str.substring(1, str.length()), sub);
    }
}
