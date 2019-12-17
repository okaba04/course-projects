package homework5;

import java.util.ArrayList;

public class MyList<T extends Number> {
    ArrayList<T> myList = new ArrayList<T>();

    public void add(T number) {
        myList.add(number);
    }

    public T findLargestValue() {
        T largest = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).doubleValue() > largest.doubleValue())
                largest = myList.get(i);
        }
        return largest;
    }

    public T findSmallestValue() {
        T smallest = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).doubleValue() < smallest.doubleValue())
                smallest = myList.get(i);
        }
        return smallest;
    }

    public void print() {
        System.out.println(myList);
    }
}
