// Source code is decompiled from a .class file using FernFlower decompiler.
public class BankAccount {
   double balance;

   public BankAccount(double var1) {
      this.balance = var1;
   }

   public void deposit(double var1) {
      this.balance += var1;
      System.out.println("Deposited: " + var1);
   }

   public void withdraw(double var1) {
      if (var1 <= this.balance) {
         this.balance -= var1;
         System.out.println("Withdrawn: " + var1);
      } else {
         System.out.println("Insufficient balance.");
      }

   }

   public double getBalance() {
      return this.balance;
   }

   public static void main(String[] var0) {
      BankAccount var1 = new BankAccount(10000.0);
      var1.deposit(2400.0);
      var1.withdraw(4640.0);
      System.out.println("Current Balance: " + var1.getBalance());
   }
}
