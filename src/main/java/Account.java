 public class Account {

     private double deposit;// created a variable to store my deposit amount
     private double balance;// created a variable to store my balance, how much money I have in the account

     public double getDeposit() {
         return deposit; // for getting the value of the deposit given to the object "account"
     }

     public void setDeposit(double deposit) {
         this.deposit = deposit; // for updating the value of the deposit given to the object "account"
     }

     public double getBalance() {
         return balance; // for getting the value of balance given to the object "account"
     }

     public void setBalance(double balance) {
         this.balance = balance; // for updating the value of the balance given to the object "account"
     }





     //Q2 - create method named printBankInfo to print the account balance
     public void printBankInfo() { // prints out how much money I have in my account by printing balance
         System.out.println("Your current balance is: " + getBalance()  + " dollars.");
     }

     // *** Extra challenge - create a method to withdraw money***
     public void withdraw(double amount) {
          if (amount < 0) { // condition to check if withdraw amount is less than zero
              System.out.println("You can't withdraw a negative number.");// if the condition is met, print out "can't withdraw a negative number"
          } else if (getBalance() >= amount) { // condition to check if balance is greater or equal to withdraw amount
              setBalance(getBalance() - amount);// if the condition is met, set the balance to get balance - amount
              System.out.println("You have withdrawn: " + amount + " dollars. Your current balance is: " + getBalance() + " dollars."); //printing out the withdrawal amount and the new balance
         } else {
              System.out.println("You're trying to withdraw more money than your balance."); // error code withdrawing too much money if your withdrawal amount is greater than your balance
         }
     }
 }




