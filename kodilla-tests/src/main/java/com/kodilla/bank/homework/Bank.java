package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(int numberOfCashMachines) {
        this.cashMachines = new CashMachine[numberOfCashMachines];
        for (int i = 0; i < numberOfCashMachines; i++) {
            this.cashMachines[i] = new CashMachine();
        }
    }

    public void addTransaction(int cashMachineIndex, int transaction) {
        this.cashMachines[cashMachineIndex].addTransaction(transaction);
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            balance += this.cashMachines[i].getBalance();
        }
        return balance;
    }

    public int getWithdrawalsCount() {
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            count += this.cashMachines[i].getWithdrawalsCount();
        }
        return count;
    }

    public int getDepositsCount() {
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            count += this.cashMachines[i].getDepositsCount();
        }
        return count;
    }

    public double getAverageWithdrawal() {
        int withdrawalsCount = getWithdrawalsCount();
        if (withdrawalsCount == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getSumOfWithdrawals();
        }
        return (double) sum / withdrawalsCount;
    }

    public double getAverageDeposit() {
        int depositsCount = getDepositsCount();
        if (depositsCount == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getSumOfDeposits();
        }
        return (double) sum / depositsCount;
    }

    public int getNumberOfTransactions() {
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            count += this.cashMachines[i].getNumberOfTransactions();
        }
        return count;
    }
}

//    W pierwszej linii metody - pobieram tablicę transakcji z bankomatu o indeksie
//    cashMachineIndex przez wywołanie metody getTransactions().
//
//    Następnie tworzę nową tablicę newTransactions, która jest o jeden większa
//    niż tablica z bankomatu, aby pomieścić nową transakcję.
//
//    Następnie wykorzystując System.arraycopy kopiuję zawartość tablicy
//    transactions (czyli oryginalnej tablicy z bankomatu) do tablicy
//    newTransactions.
//
//    W kolejnym kroku wpisuję wartość nowej transakcji do ostatniego indeksu
//    newTransactions.
//
//    Na końcu, tworzę nową instancję klasy CashMachine z uaktualnioną tablicą
//    newTransactions i przypisuję ją do tablicy cashMachines na odpowiednim
//    miejscu, aby zaktualizować stan bankomatu.


