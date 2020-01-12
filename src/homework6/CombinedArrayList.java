package homework6;

import java.util.ArrayList;

public class CombinedArrayList {
    public static void runApplication() {
        System.out.println("Task 1");
        CombinedArrayList.removeElement();
        System.out.println("Task 2");
        CombinedArrayList.replaceValue();
        System.out.println("Task 3");
        CombinedArrayList.checkCommonElements();
    }

    private static void removeElement() {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(9);
        numbersList.add(11);
        numbersList.add(18);
        numbersList.add(20);
        numbersList.add(22);
        System.out.println("Default List: " + numbersList);

        numbersList.removeIf(n -> (n % 3 == 0));
        System.out.println("Updated List: " + numbersList);
    }

    private static void replaceValue() {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Melon");
        System.out.println("Default List: " + fruitList);

        int index = fruitList.indexOf("Orange");
        if (index == -1) {
            System.out.println("Value isn't present");
        } else {
            fruitList.set(index, "Grapefruit");
            System.out.println("Updated List: " + fruitList);
        }
    }

    private static void checkCommonElements() {
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(4);
        firstList.add(9);
        firstList.add(5);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(4);
        secondList.add(3);
        secondList.add(3);
        secondList.add(8);
        System.out.println("List1: " + firstList);
        System.out.println("List2: " + secondList);

        firstList.retainAll(secondList);
        System.out.println("List with common elements: " + firstList);
    }
}
