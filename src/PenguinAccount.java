public class PenguinAccount extends Account {

    @Override
    public Boolean withdraw(int amount){
        if(amount < this.getBalance()) {
            super.withdraw(amount);
            return true;
        }
        return false;
    }


}
