package final_exam.Models;

public class MainAccount extends BankAccount {
    private String idCard;
    private String moneyInCard;

    public MainAccount() {
    }

    public MainAccount(String idCard, String moneyInCard) {
        this.idCard = idCard;
        this.moneyInCard = moneyInCard;
    }

    public MainAccount(int accountId, String accountCode, String name, String createDay, String idCard, String moneyInCard) {
        super(accountId, accountCode, name, createDay);
        this.idCard = idCard;
        this.moneyInCard = moneyInCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMoneyInCard() {
        return moneyInCard;
    }

    public void setMoneyInCard(String moneyInCard) {
        this.moneyInCard = moneyInCard;
    }

    @Override
    public String toString() {
        return "MainAccount{" +
                "accountId='" + getAccountId() + '\'' +
                ", accountCode='" + getAccountCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", createDay='" + getCreateDay() + '\'' +
                "idCard='" + idCard + '\'' +
                ", moneyInCard='" + moneyInCard + '\'' +
                '}';
    }

    @Override
    public String infoWriteCSV() {
        return getAccountId()
                + "," + getAccountCode()
                + "," + getName()
                + "," + getCreateDay()
                + "," + idCard
                + "," + moneyInCard;
    }
}
