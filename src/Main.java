

public class Main {



    public static void main(String[] args) {
        Bank b = new Bank();

        b.addAccount(20000,3);//Credit konto
        b.addAccount(10,1);//Børnekonto
        b.addAccount(1000,2);//VIPKonto

        //tester med børnekonto
        Account kidsaccount =  b.accounts.get(1);
        System.out.println("Prøver at trække 11 kr ud, når der kun er 10: "+kidsaccount.withdraw(10));

       //tester creditkonto
        Account creditaccount = b.accounts.get(0);
        boolean result =  creditaccount.withdraw(5000);
        System.out.println("Det gik fint med at trække max beløbet: "+result);
        boolean result2 =  creditaccount.withdraw(5001);
        System.out.println("Det går galt når jeg trækker mere end maxbeløbet: "+result2);

        System.out.println(kidsaccount.getBalance());
    }
}