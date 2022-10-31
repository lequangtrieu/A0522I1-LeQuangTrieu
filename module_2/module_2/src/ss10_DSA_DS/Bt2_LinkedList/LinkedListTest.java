package ss10_DSA_DS.Bt2_LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> check = new LinkedList<>(10);
        check.addFirst(15);
        check.addFirst(14);
        check.addFirst(2);
        check.addLast(7);
        check.add(4, 8);

        System.out.print(check.get(0) + " ");
        System.out.print(check.get(1) + " ");
        System.out.print(check.get(2) + " ");
        System.out.print(check.get(3) + " ");


        check.add(6, 9);
        System.out.println(check.indexOf(9));
        System.out.println(check.getLast());

        check.clear();

    }
}
