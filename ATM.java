//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ATM {
   private double balance;
   private double depositamount;
   private double withdrawamount;

    //default constructor
    public ATM(){

    }
    //getter setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(double depositamount) {
        this.depositamount = depositamount;
    }

    public double getWithdrawamount() {
        return withdrawamount;
    }

    public void setWithdrawamount(double withdrawamount) {
        this.withdrawamount = withdrawamount;
    }
}
