package bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    @Test
    public void ShouldAddTransaction() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-20);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(50, transactions[0]);
        assertEquals(-20, transactions[1]);
    }

    @Test
    public void ShouldGetBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-30);
        assertEquals(50, cashMachine.getBalance());
    }

    @Test
    public void ShouldGetWithdrawalsCount() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-30);
        assertEquals(2, cashMachine.getWithdrawalsCount());
    }

    @Test
    public void ShouldGetDepositsCount() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-30);
        cashMachine.addTransaction(50);
        assertEquals(2, cashMachine.getDepositsCount());
    }

    @Test
    public void ShouldGetSumOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-30);
        assertEquals(-50, cashMachine.getSumOfWithdrawals(), 0.001);
    }

    @Test
    public void ShouldGetSumOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-30);
        cashMachine.addTransaction(50);
        assertEquals(150, cashMachine.getSumOfDeposits(), 0.001);
    }

    @Test
    public void ShouldGetNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-30);
        cashMachine.addTransaction(50);
        assertEquals(4, cashMachine.getNumberOfTransactions());
    }
}

//
//    @Test
//    public void shouldHaveZeroBalanceIfNoTransactions() {
//        CashMachine cashMachine = new CashMachine();
//        assertEquals(0, cashMachine.getBalance());
//    }
//
//    @Test
//    public void shouldReturnBalanceOfTransactions() {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.addTransaction(100);
//        cashMachine.addTransaction(-50);
//        assertEquals(50, cashMachine.getBalance());
//    }
//
//    @Test
//    public void shouldReturnNumberOfTransactions() {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.addTransaction(100);
//        cashMachine.addTransaction(-50);
//        cashMachine.addTransaction(200);
//        assertEquals(3, cashMachine.getNumberOfTransactions());
//    }
//
//    @Test
//    public void shouldReturnNumberOfWithdrawals() {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.addTransaction(100);
//        cashMachine.addTransaction(-50);
//        cashMachine.addTransaction(-25);
//        cashMachine.addTransaction(-75);
//        assertEquals(3, cashMachine.getWithdrawalsCount());
//    }
//
//    @Test
//    public void shouldReturnNumberOfDeposits() {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.addTransaction(100);
//        cashMachine.addTransaction(-50);
//        cashMachine.addTransaction(-25);
//        cashMachine.addTransaction(-75);
//        cashMachine.addTransaction(200);
//        assertEquals(2, cashMachine.getDepositsCount());
//    }
//
//    @Test
//    public void shouldReturnAverageWithdrawal() {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.addTransaction(-50);
//        cashMachine.addTransaction(-25);
//        cashMachine.addTransaction(-75);
//        assertEquals(-50, cashMachine.getAverageWithdrawal(), 0.001);
//    }
//
//    @Test
//    public void shouldReturnZeroAverageWithdrawalIfNoWithdrawals() {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.addTransaction(100);
//        cashMachine.addTransaction(50);
//        assertEquals(0, cashMachine.getAverageWithdrawal(), 0.001);
//    }
//
//    @Test
//    public void shouldReturnAverageDeposit() {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.addTransaction(100);
//        cashMachine.addTransaction(50);
//        cashMachine.addTransaction(200);
//        assertEquals(116.67, cashMachine.getAverageDeposit(), 0.01);
//    }
//
//    @Test
//    public void shouldReturnZeroAverageDepositIfNoDeposits() {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.addTransaction(-50);
//        cashMachine.addTransaction(-25);
//        assertEquals(0, cashMachine.getAverageDeposit(), 0.001);
//    }
//}
