package ss20_code_fpt.Week_3.Lab3;

import java.time.LocalDate;

public class NorthBank extends SoftBank{
    private final double levelSalary = 2;

    public NorthBank() {
    }

    public NorthBank(int id, String name, LocalDate foundedDate, String address, int amountSenior, int amountJunior) {
        super(id, name, foundedDate, address, amountSenior, amountJunior);
    }

    @Override
    public double estimateCost() {
        return (this.getAmountSenior() * 5000 * this.levelSalary) + (this.getAmountJunior() * 2000 * this.levelSalary);
    }


}
