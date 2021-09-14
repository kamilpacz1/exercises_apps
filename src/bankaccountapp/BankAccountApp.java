package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
    String file = "D:\\nauka_java\\emailapp\\NewBankAccounts.csv";
        List<Account> accounts = new LinkedList<>();
        //Read a CSV file then create new accounts based on that idea


        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name,sSN,initDeposit));
            } else if (accountType.equals("Checking")) {
                System.out.println("Open a checking account");
                accounts.add(new Checking(name,sSN,initDeposit));

            } else {
                System.out.println("Error reading account type");
            }
        }

        for (Account acc : accounts) {
            acc.toString();
        }
    }
}
