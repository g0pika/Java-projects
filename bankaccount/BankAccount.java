public class BankAccount {
   private double balance;

   public BankAccount() {
      this.balance = 0;
   }

   public void deposit(double amount) {
      this.balance += amount;
   }

   public void withdraw(double amount) {
      if (this.balance - amount >= 0) {
         this.balance -= amount;
      }
   }

   public double getBalance() {
      return this.balance;
   }
}
