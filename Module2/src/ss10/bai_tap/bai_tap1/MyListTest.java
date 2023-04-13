package ss10.bai_tap.bai_tap1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer>listInterger = new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(5);
        listInterger.add(6);
        System.out.println(listInterger.get(4));
        listInterger.remove(2);
        System.out.println(listInterger.toString());
        listInterger.add(8);

    }
}
