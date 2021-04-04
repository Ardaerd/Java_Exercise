package ArrayList.swapPairs;

import java.util.ArrayList;

public class swapPairs {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("be");
        arr.add("to");
        arr.add("not");
        arr.add("or");
        arr.add("be");
        arr.add("to");
        arr.add("-Hamlet");
        arr.add("that is the question");

        System.out.println(arr);

        swapPairs(arr);
        System.out.println(arr);
    }

    public static void swapPairs(ArrayList<String> arr) {

        for (int i = 0; i < arr.size()/2; i++) {
            String temp = arr.get(2*i+1);
            arr.set(2*i+1, arr.get(2*i));
            arr.set(2*i,temp);
        }
    }
}
