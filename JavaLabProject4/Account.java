/*
 * 15.	[Interface] The following interface Account gives an abstract view of a bank’s deposit and withdraw operation.
interface Account
{
void Deposit(int amount); void Withdraw(int amount);
}
class ImplementAccount implements Account
{
// TODO
}

Write the TODO part of ImplementAccount class that implements the Deposit() and Withdraw() methods of the Account interface.

 */

package JavaLabProject4;
interface Account {
    void Deposit(int amount);
    void Withdraw(int amount);
}

class ImplementAccount implements Account {
    private int balance;

    public void Deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void Withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        ImplementAccount account = new ImplementAccount();
        account.Deposit(1000);
        account.Withdraw(500);
        account.Withdraw(700);
    }
}
