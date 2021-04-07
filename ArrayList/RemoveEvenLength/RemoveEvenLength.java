package ArrayList.RemoveEvenLength;

import java.util.ArrayList;

public class RemoveEvenLength {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("To");
        arrayList.add("be");
        arrayList.add("or");
        arrayList.add("not");
        arrayList.add("to");
        arrayList.add("be");
        arrayList.add(", that is the question.");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        removeEvenLength(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

    public static void removeEvenLength(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() % 2 == 0) {
                arrayList.remove(i);
                i--;
            }
        }
    }

}
