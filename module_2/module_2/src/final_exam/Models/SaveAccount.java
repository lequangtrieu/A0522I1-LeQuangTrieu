package final_exam.Models;

public class SaveAccount extends BankAccount {
    private int amountSaveMoney;
    private String day;
    private String percentMoney;
    private String month;

    public SaveAccount() {
    }

    public SaveAccount(int amountSaveMoney, String day, String percentMoney, String month) {
        this.amountSaveMoney = amountSaveMoney;
        this.day = day;
        this.percentMoney = percentMoney;
        this.month = month;
    }

    public SaveAccount(int accountId, String accountCode, String name, String createDay, int amountSaveMoney, String day, String percentMoney, String month) {
        super(accountId, accountCode, name, createDay);
        this.amountSaveMoney = amountSaveMoney;
        this.day = day;
        this.percentMoney = percentMoney;
        this.month = month;
    }

    public int getAmountSaveMoney() {
        return amountSaveMoney;
    }

    public void setAmountSaveMoney(int amountSaveMoney) {
        this.amountSaveMoney = amountSaveMoney;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPercentMoney() {
        return percentMoney;
    }

    public void setPercentMoney(String percentMoney) {
        this.percentMoney = percentMoney;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "SaveAccount{" +
                "accountId='" + getAccountId() + '\'' +
                ", accountCode='" + getAccountCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", createDay='" + getCreateDay() + '\'' +
                "amountSaveMoney=" + amountSaveMoney +
                ", day='" + day + '\'' +
                ", percentMoney='" + percentMoney + '\'' +
                ", month='" + month + '\'' +
                '}';
    }

    @Override
    public String infoWriteCSV() {
        return getAccountId()
                + "," + getAccountCode()
                + "," + getName()
                + "," + getCreateDay()
                + "," + amountSaveMoney
                + "," + day
                + "," + percentMoney
                + "," + month;
    }


}
