package ss20_code_fpt.Week_3.Lab3;

import java.time.LocalDate;

public class CenterBank extends SoftBank{
    private final double levelSalary = 1.5;
    private int amountCollaboration;

    public CenterBank() {
    }

    public CenterBank(int amountCollaboration) {
        this.amountCollaboration = amountCollaboration;
    }

    public CenterBank(int id, String name, LocalDate foundedDate, String address, int amountSenior, int amountJunior, int amountCollaboration) {
        super(id, name, foundedDate, address, amountSenior, amountJunior);
        this.amountCollaboration = amountCollaboration;
    }

    public double getLevelSalary() {
        return levelSalary;
    }

    public int getAmountCollaboration() {
        return amountCollaboration;
    }

    public void setAmountCollaboration(int amountCollaboration) {
        this.amountCollaboration = amountCollaboration;
    }

    @Override
    public String toString() {
        return "CenterBank{" +
                "levelSalary=" + levelSalary +
                ", amountCollaboration=" + amountCollaboration +
                '}';
    }

    @Override
    public double estimateCost() {
        return (this.getAmountSenior() * 5000 * this.levelSalary) + (this.getAmountJunior() * 2000 * this.levelSalary);
    }

    public double actualCost() {
        return this.estimateCost() + (this.amountCollaboration * 1000);
    }
}
