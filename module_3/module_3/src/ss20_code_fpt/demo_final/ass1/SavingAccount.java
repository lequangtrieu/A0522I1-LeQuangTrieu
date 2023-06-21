package ss20_code_fpt.demo_final.ass1;

public class SavingAccount {
    String accountId;
    int balance;

    public SavingAccount() {
    }

    public SavingAccount(String accountId, int balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    boolean savingWithDraw(int money) {
        if (money >=  0 && money < this.balance) {
            balance = this.balance - money;
            return true;
        } else {
            return false;
        }
    }

    boolean savingDeposit(int money) {
        if (money >= 0) {
            balance = this.balance + money;
            return true;
        } else {
            return false;
        }
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public int getMoney() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
