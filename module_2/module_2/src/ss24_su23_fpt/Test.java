package ss24_su23_fpt;

public class Test {
    public void print(int n) {
        if (n ==0 ) return;
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.print(3);

    }
}
