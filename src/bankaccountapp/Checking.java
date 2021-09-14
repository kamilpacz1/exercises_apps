package bankaccountapp;

public class Checking extends Account {

    //List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate() {
       rate = getBaseRate() * .15;
    }

    //List any methods specific to the checking account

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    @Override
    public String toString() {
        return "Name:'" + name + '\'' +
                ", Balance: " + balance +
                ", Account Number: '" + accountNumber + '\'' +
                ", Account type: savings" + '\'' +
                ", Debit Card Number:  " + debitCardNumber +
                ", Debit card PIN: " + debitCardPin +
                ", Rate: " + rate + "%";
    }

}
