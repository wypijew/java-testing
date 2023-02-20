package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int transaction) {
        this.transactions = Arrays.copyOf(this.transactions, this.transactions.length + 1);
        this.transactions[this.size] = transaction;
        this.size++;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < this.size; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }

    public int getWithdrawalsCount() {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.transactions[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public int getDepositsCount() {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.transactions[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public double getSumOfWithdrawals() {
        if (getWithdrawalsCount() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.transactions[i] < 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }

    public double getSumOfDeposits() {
        if (getDepositsCount() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.transactions[i] > 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }

    public int getNumberOfTransactions() {
        return this.size;
    }
}



//package com.kodilla.bank.homework;
//
//import java.util.Arrays;
//
//public class CashMachine {
//
//    private int[] transactions;
//    private int size;
//
//    public CashMachine() {
//        this.size = 0;
//        this.transactions = new int[0];
//    }
//
//    public void addTransaction(int transaction) {
//        int[] newTransactions = new int[this.size + 1];
//        System.arraycopy(this.transactions, 0, newTransactions, 0, this.size);
//        newTransactions[this.size] = transaction;
//        this.transactions = newTransactions;
//        this.size++;
//    }
//
//    public int getBalance() {
//        int balance = 0;
//        for (int i = 0; i < this.transactions.length; i++) {
//            balance += this.transactions[i];
//        }
//        return balance;
//    }
//
//    public int getWithdrawalsCount() {
//        int withdrawalsCount = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            if (transactions[i] < 0) {
//                withdrawalsCount++;
//            }
//        }
//        return withdrawalsCount;
//    }
//
//    public int getDepositsCount() {
//        int depositsCount = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            if (transactions[i] > 0) {
//                depositsCount++;
//            }
//        }
//        return depositsCount;
//    }
//
//    public double getAverageWithdrawal() {
//        int withdrawalsCount = 0;
//        double withdrawalsSum = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            if (transactions[i] < 0) {
//                withdrawalsCount++;
//                withdrawalsSum += transactions[i];
//            }
//        }
//        if (withdrawalsCount == 0) {
//            return 0;
//        }
//        return withdrawalsSum / withdrawalsCount;
//    }
//
//    public double getAverageDeposit() {
//        int depositsCount = 0;
//        double depositsSum = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            if (transactions[i] > 0) {
//                depositsCount++;
//                depositsSum += transactions[i];
//            }
//        }
//        if (depositsCount == 0) {
//            return 0;
//        }
//        return depositsSum / depositsCount;
//    }
//
//    public int getTransactionCount() {
//        return this.size;
//    }
//
//}
