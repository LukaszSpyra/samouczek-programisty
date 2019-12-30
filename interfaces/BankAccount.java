package interfaces;

public class BankAccount implements Account{
   private int status;

    int getStatus() {
        return status;
    }

    public void deposit(int amount) {
        status=status+amount;
    }

    public void withdraw(int amount) {
        if (status>=amount){
        status =status-amount;
        } else {
            System.out.println("Brak wystarczajacych srodkow do transakji!");
        }
    }
}
