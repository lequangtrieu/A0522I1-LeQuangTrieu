package ss21_code_fpt.pt1;

public class BinzStudenyt extends Student{
    private double account;
    private double marketing;

    public BinzStudenyt() {
    }

    public BinzStudenyt(double account, double marketing) {
        this.account = account;
        this.marketing = marketing;
    }

    public BinzStudenyt(String name, String address, int age, double account, double marketing) {
        super(name, address, age);
        this.account = account;
        this.marketing = marketing;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    @Override
    public String toString() {
        return super.toString() +
                "BinzStudenyt{" +
                "account=" + account +
                ", marketing=" + marketing +
                "totalScore = " + totalScore() +
                '}';
    }

    @Override
    public double totalScore() {
        return (2 * getAccount() + getMarketing()) / 3;
    }


}
