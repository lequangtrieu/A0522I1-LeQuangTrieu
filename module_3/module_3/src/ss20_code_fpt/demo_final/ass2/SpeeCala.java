package ss20_code_fpt.demo_final.ass2;

public class SpeeCala extends Cala{
    private int color;

    public SpeeCala() {
    }

    public SpeeCala(int color) {
        this.color = color;
    }

    public SpeeCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" +
                super.toString() +
                ", " + this.getColor();
    }

    public void setData() {
        String owner = getOwner();
        owner = owner.replace(String.valueOf(owner.charAt(1)), "XX");
        System.out.println(owner + ", " + this.getPrice());
    }

    public int getValue() {
        if (this.getColor() % 2 == 1) {
            return this.getPrice() + 3;
        } else {
            return this.getPrice() + 7;
        }
    }
}
