import java.util.ArrayList;

public class Bank {
    public ArrayList<Account> accounts = new ArrayList<>();
    public void addAccount(int defaultBalance, int type){
        //instantier et konto objekt
        /// Account a = new Account();
        Account a = null;

         switch (type){
             case 1:  a = new PenguinAccount();

                 break;

             case 2:  a = new VIPAccount();          break;


             case 3: a = new CreditAccount();     break;
             default:
         }

        //placer objektet i arrayListe, accounts
        accounts.add(a);
        //sæt penge ind på kontoen
        a.deposit(defaultBalance);
      // a.setOwner();

    }


}

