package bankaccountapp;

public class Savings extends Account{

    //List properties specific to the Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize settings for the Savings properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();


    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    //List any methods specific to savings account

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }


    @Override
    public String toString() {
        return "Name:'" + name + '\'' +
                ", Balance: " + balance +
                ", Account Number: '" + accountNumber + '\'' +
                ", Account type: savings" + '\'' +
                ", Safety Deposit Box ID: " + safetyDepositBoxID +
                ", Safety Deposit Box Key: " + safetyDepositBoxKey +
                ", Rate: " + rate + "%";
    }
}
