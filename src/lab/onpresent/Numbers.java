package lab.onpresent;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers {

    public static void main(String[] args) {

        ArrayList<Number> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(18);
        arrayList.add(20);
        arrayList.add(22);

        System.out.println("***");
        System.out.println("Full ArrayList of Numbers: " + arrayList.toString());

        Iterator<Number> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            Number nextElement = arrayListIterator.next();
            if ((int) nextElement % 3 == 0) {
                arrayListIterator.remove();
            }
        }

        System.out.println("ArrayList without numbers divisible by 3: " + arrayList.toString());
        System.out.println("***");

    }

}
