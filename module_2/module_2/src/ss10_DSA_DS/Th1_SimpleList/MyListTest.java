package ss10_DSA_DS.Th1_SimpleList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
//       hàm add phần tử vào mảng elements

//        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        System.out.println("element 0: " + listInteger.get(0));

        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));

        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}
