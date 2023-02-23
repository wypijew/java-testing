package bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    @Test
    public void shouldGetTotalBalance() {
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(-50);
        int expected = 50;
        int actual = bank.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectWithdrawalsCount() {
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        cashMachine1.addTransaction(-50);
        cashMachine2.addTransaction(100);
        cashMachine2.addTransaction(-25);
        int expectedWithdrawalsCount = 2;
        int actualWithdrawalsCount = bank.getWithdrawalsCount();
        assertEquals(expectedWithdrawalsCount, actualWithdrawalsCount);
    }

    @Test
    public void shouldReturnCorrectDepositsCount() {
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        cashMachine1.addTransaction(50);
        cashMachine2.addTransaction(-100);
        cashMachine2.addTransaction(25);
        int expectedDepositsCount = 2;
        int actualDepositsCount = bank.getDepositsCount();
        assertEquals(expectedDepositsCount, actualDepositsCount);
    }

    @Test
    public void shouldGetWithdrawalsCount() {
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        cashMachine1.addTransaction(-100);
        cashMachine1.addTransaction(-200);
        cashMachine2.addTransaction(-50);

        int expected = 3;
        int actual = bank.getWithdrawalsCount();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetDepositsCount() {
        Bank bank = new Bank(3);
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(200);
        cashMachine3.addTransaction(300);

        int expected = 3;
        int actual = bank.getDepositsCount();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAverageWithdrawal() {
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        cashMachine1.addTransaction(-100);
        cashMachine1.addTransaction(-200);
        cashMachine2.addTransaction(-50);

        double expected = -116.67;
        double actual = bank.getAverageWithdrawal();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void shouldGetAverageDeposit() {
        Bank bank = new Bank(3);
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(200);
        cashMachine3.addTransaction(-300);

        double expected = 150.00;
        double actual = bank.getAverageDeposit();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void shouldReturnCorrectNumberOfTransactions() {
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine2.addTransaction(-25);

        int expected = 3;
        int actual = bank.getNumberOfTransactions();
        assertEquals(expected, actual);
    }
}

//
//    @Test
//    public void testGetTotalWithdrawals() {
//        Bank bank = new Bank(2);
//        bank.addTransaction(0,-50);
//        bank.addTransaction(1,-100);
//        double expected = -150.0;
//        double actual = bank.getBalance();
//        assertEquals(expected, actual, 0.001);
//    }
//
//    @Test
//    public void testGetTotalDeposits() {
//        Bank bank = new Bank(2);
//        bank.addTransaction(0,100);
//        bank.addTransaction(1,50);
//        double expected = 150.0;
//        double actual = bank.getBalance();
//        assertEquals(expected, actual, 0.001);
//    }
//
//    @Test
//    public void testGetTotalNumberOfTransactions() {
//        Bank bank = new Bank(2);
//        bank.addTransaction(0,100);
//        bank.addTransaction(1,-50);
//        int expected = 2;
//        int actual = bank.getNumberOfTransactions();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testGetAverageWithdrawal() {
//        Bank bank = new Bank(3);
//        bank.addTransaction(0,-100);
//        bank.addTransaction(1,-50);
//        bank.addTransaction(2,-150);
//        double expected = -100.0;
//        double actual = bank.getAverageWithdrawal();
//        assertEquals(expected, actual, 0.001);
//    }
//
//    @Test
//    public void testGetAverageDeposit() {
//        Bank bank = new Bank(3);
//        bank.addTransaction(0,100);
//        bank.addTransaction(1,50);
//        bank.addTransaction(2,150);
//        double expected = 100.0;
//        double actual = bank.getAverageDeposit();
//        assertEquals(expected, actual, 0.001);
//    }
//
//    @Test
//    public void testGetTotalWithdrawalsWhenNoWithdrawals() {
//        Bank bank = new Bank(2);
//        bank.addTransaction(0,100);
//        bank.addTransaction(1,50);
//        double expected = 0;
//        double actual = bank.getWithdrawalsCount();
//        assertEquals(expected, actual, 0.001);
//    }
//
//    @Test
//    public void testGetTotalDepositsWhenNoDeposits() {
//        Bank bank = new Bank(2);
//        bank.addTransaction(0,-100);
//        bank.addTransaction(1,-50);
//        double expected = 0;
//        double actual = bank.getDepositsCount();
//        assertEquals(expected, actual, 0.001);
//    }
//}
