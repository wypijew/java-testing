package bank.homework;

import com.kodilla.bank.homework.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    @Test
    public void testGetTotalBalance() {
        Bank bank = new Bank(2);
        bank.addTransaction(0,100);
        bank.addTransaction(1,-50);
        int expected = 50;
        int actual = bank.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTotalWithdrawals() {
        Bank bank = new Bank(2);
        bank.addTransaction(0,-50);
        bank.addTransaction(1,-100);
        double expected = -150.0;
        double actual = bank.getBalance();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetTotalDeposits() {
        Bank bank = new Bank(2);
        bank.addTransaction(0,100);
        bank.addTransaction(1,50);
        double expected = 150.0;
        double actual = bank.getBalance();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetTotalNumberOfTransactions() {
        Bank bank = new Bank(2);
        bank.addTransaction(0,100);
        bank.addTransaction(1,-50);
        int expected = 2;
        int actual = bank.getNumberOfTransactions();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAverageWithdrawal() {
        Bank bank = new Bank(3);
        bank.addTransaction(0,-100);
        bank.addTransaction(1,-50);
        bank.addTransaction(2,-150);
        double expected = -100.0;
        double actual = bank.getAverageWithdrawal();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetAverageDeposit() {
        Bank bank = new Bank(3);
        bank.addTransaction(0,100);
        bank.addTransaction(1,50);
        bank.addTransaction(2,150);
        double expected = 100.0;
        double actual = bank.getAverageDeposit();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetTotalWithdrawalsWhenNoWithdrawals() {
        Bank bank = new Bank(2);
        bank.addTransaction(0,100);
        bank.addTransaction(1,50);
        double expected = 0;
        double actual = bank.getWithdrawalsCount();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetTotalDepositsWhenNoDeposits() {
        Bank bank = new Bank(2);
        bank.addTransaction(0,-100);
        bank.addTransaction(1,-50);
        double expected = 0;
        double actual = bank.getDepositsCount();
        assertEquals(expected, actual, 0.001);
    }
}
