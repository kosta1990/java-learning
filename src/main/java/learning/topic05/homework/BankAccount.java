package learning.topic05.homework;

public class BankAccount {
    double balance;

    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        balance -= amount;
    }
}
class BankAccountTest{
    void main(){
        BankAccount account = new BankAccount();
        account.balance = 100;
        account.deposit(50);
        account.withdraw(30);
        IO.println("Balance: " + account.balance);
    }
}