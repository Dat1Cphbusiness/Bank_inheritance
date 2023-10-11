public class Account {
    private int balance;


    public void deposit(int amount){
      //  this.balance = balance + amount;
        this.balance +=amount;
    }

    public Boolean withdraw(int amount){
        this.balance -= amount;
        return true;
    }

    public int getBalance() {
        return balance;
    }
}
