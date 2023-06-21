package ss20_code_fpt.Demo;

public class Person {
    private int code;
    String name;
    int age;

    public Person(String name, int age) {
        this.code++;
        this.name = name;
        this.age = age;
    }

    public int getCode() {
        return code;
    }
}
