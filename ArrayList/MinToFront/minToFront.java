package ArrayList.MinToFront;

import java.util.ArrayList;

public class minToFront {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(7);
        System.out.println(arrayList);

        minToFront(arrayList);
        System.out.println(arrayList);
    }

    public static void minToFront(ArrayList<Integer> arrayList) {
        int minIndex = 0;

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(minIndex) > arrayList.get(i))
                minIndex = i;
        }

        int minValue = arrayList.remove(minIndex);
        arrayList.add(0,minValue);
    }
}
