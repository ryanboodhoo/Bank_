public static void main(String[] args) {
    Account account = new Account();//intelligizing a new object account name
    account.setBalance(100.0);// Setting Balance for the first account
    account.withdraw(105);// How much money I'm taking out
    account.printBankInfo();// printing the final results

    Account account1 = new Account();//intelligizing a new object account 1
        account1.setBalance(100.0);// Setting Balance for account 1
        account1.withdraw(-500.0);// How much money I'm taking out,this will print an hour
        account1.printBankInfo();// printing the final results for this account1

}