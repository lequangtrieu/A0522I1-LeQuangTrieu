package ss21_code_fpt.pt1;

public class ItStudent extends Student{
    private double java;
    private double css;

    public ItStudent() {
    }

    public ItStudent(double java, double css) {
        this.java = java;
        this.css = css;
    }

    public ItStudent(String name, String address, int age, double java, double css) {
        super(name, address, age);
        this.java = java;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ItStudent{" +
                "java=" + java +
                ", css=" + css +
                "totalScore = " + totalScore() +
                '}';
    }

    @Override
    public double totalScore() {
        return (3 * this.getJava() + getCss()) / 4;
    }
}
