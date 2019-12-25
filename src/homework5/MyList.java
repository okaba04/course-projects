package homework5;

import java.util.ArrayList;

public class MyList<T extends Number> {
    ArrayList<T> myList = new ArrayList<>();

    public void add(T number) {
        myList.add(number);
    }

    public T findLargestValue() {
        T largest = myList.get(0);
        for (T aMyList : myList) {
            if (aMyList.doubleValue() > largest.doubleValue())
                largest = aMyList;
        }
        return largest;
    }

    public T findSmallestValue() {
        T smallest = myList.get(0);
        for (T aMyList : myList) {
            if (aMyList.doubleValue() < smallest.doubleValue())
                smallest = aMyList;
        }
        return smallest;
    }

    public void print() {
        System.out.println(myList);
    }
}
