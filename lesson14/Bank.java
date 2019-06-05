package pl.samouczekprogramisty.lesson14;

import java.util.Scanner;

public class Bank implements BankTransfer {
    private int transferAmount;
    private static int commission;
    private int accountStatus;

    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        accountStatus = from.getStatus();
        if (accountStatus > amount) {
            from.withdraw(amount);
            to.deposit(amount - 1);
            commission++;
        } else {
            System.out.println("Brak wystarczajacych srodkow do transakcji");
        }
    }

    public static void main(String[] args) {

        BankAccount from = new BankAccount();
        BankAccount to = new BankAccount();
        Bank bank = new Bank();

        Scanner input = new Scanner(System.in);

        boolean flag = false;
        while (!flag) {
            System.out.println("Co chcesz zrobic? Wybierz: 1-wplata, 2-wyplata, 3-przelew z konta, 4-koniec.");
            int result = input.nextInt();
            if (result == 4) {
                System.out.println("Laczna prowizja banku od transakcji:" + commission);
                flag = true;
                break;
            } else if (result != 1 && result != 2 && result != 3) {
                System.out.println("Podales zly rodzaj transakcji, sprobuj jeszcze raz:");
            } else {
                System.out.println("Podaj kwote transakcji:");
                int amountGiven = input.nextInt();
                if (result == 1) {
                    from.deposit(amountGiven);
                    System.out.println("Nowy stan konta:" + from.getStatus());
                } else if (result == 2) {
                    from.withdraw(amountGiven);
                    System.out.println("Nowy stan konta:" + from.getStatus());
                } else if (result == 3) {
                    bank.transfer(from, to, amountGiven);
                    System.out.println("Nowy stan konta pierwotnego :" + from.getStatus());
                    System.out.println("Nowy stan konta docelowego:" + to.getStatus());
                }
            }
        }
    }
}