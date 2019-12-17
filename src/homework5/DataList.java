package homework5;

public class DataList {
    public static void buildList() {
        MyList<Number> list = new MyList<Number>();
        list.add(2.56);
        list.add(2.3);
        list.add(2.78);
        list.add(150);
        list.add(-1);
        list.add(32);
        list.add(0);
        list.add(3);

        System.out.println("ArrayList data: ");
        list.print();
        System.out.println("The largest value in ArrayList: " + list.findLargestValue());
        System.out.println("The smallest value in ArrayList: " + list.findSmallestValue());
    }
}
