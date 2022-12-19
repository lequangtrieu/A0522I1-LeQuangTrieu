package final_exam.Models;


public abstract class BankAccount {
    private int accountId;
    private String accountCode;
    private String name;
    private String createDay;

    public BankAccount() {
    }

    public BankAccount(int accountId, String accountCode, String name, String createDay) {
        this.accountId = accountId;
        this.accountCode = accountCode;
        this.name = name;
        this.createDay = createDay;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateDay() {
        return createDay;
    }

    public void setCreateDay(String createDay) {
        this.createDay = createDay;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", accountCode='" + accountCode + '\'' +
                ", name='" + name + '\'' +
                ", createDay='" + createDay + '\'' +
                '}';
    }

    public abstract String infoWriteCSV();
}
