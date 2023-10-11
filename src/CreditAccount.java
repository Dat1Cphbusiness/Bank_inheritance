public class CreditAccount extends Account{
     int maxAmount = 5000;
    @Override
    public Boolean withdraw(int amount) {
        //amount må ikke overstige et maxbeløb
          if(amount <= maxAmount) {
              super.withdraw(amount);
              return true;
          }
         return false;
    }
}
