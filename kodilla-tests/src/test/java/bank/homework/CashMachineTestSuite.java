package bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroBalanceIfNoTransactions() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnBalanceOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        assertEquals(50, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);
        assertEquals(3, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldReturnNumberOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-25);
        cashMachine.addTransaction(-75);
        assertEquals(3, cashMachine.getWithdrawalsCount());
    }

    @Test
    public void shouldReturnNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-25);
        cashMachine.addTransaction(-75);
        cashMachine.addTransaction(200);
        assertEquals(2, cashMachine.getDepositsCount());
    }

    @Test
    public void shouldReturnAverageWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-25);
        cashMachine.addTransaction(-75);
        assertEquals(-50, cashMachine.getAverageWithdrawal(), 0.001);
    }

    @Test
    public void shouldReturnZeroAverageWithdrawalIfNoWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(50);
        assertEquals(0, cashMachine.getAverageWithdrawal(), 0.001);
    }

    @Test
    public void shouldReturnAverageDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(200);
        assertEquals(116.67, cashMachine.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldReturnZeroAverageDepositIfNoDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-25);
        assertEquals(0, cashMachine.getAverageDeposit(), 0.001);
    }
}
