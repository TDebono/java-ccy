public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public void checkBalance() {
    //Check balance:
    System.out.println("Your balance is "+ balance);
  }

  public void deposit(int amountToDeposit) {
    balance += amountToDeposit;
  }

  public int withdraw(int amountToWithdraw) {
    balance -= amountToWithdraw;
    return amountToWithdraw;
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    savings.checkBalance();
    savings.deposit(1000);
    savings.checkBalance();
    int x = savings.withdraw(40);
    savings.checkBalance();
    System.out.println(x);
    
  }       
}
