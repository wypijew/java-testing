package bank.homework;

import com.kodilla.bank.homework.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {
    @Test
    public void shouldReturnZeroBalanceIfNoTransactions() {
        Bank bank = new Bank(1);
        Assertions.assertEquals(0, bank.getBalance());
    }

//  Tests if the new bank has a balance of 0.

    @Test
    public void shouldReturnCorrectBalanceForSingleTransaction() {
        Bank bank = new Bank(1);
        bank.addTransaction(0, 500);
        Assertions.assertEquals(500, bank.getBalance());
    }
//   checks if the getBalance() method of a Bank instance returns
//   the correct balance when a single transaction is made

    @Test
    public void shouldReturnCorrectBalanceForMultipleTransactions() {
        Bank bank = new Bank(2);
        bank.addTransaction(0, 100);
        bank.addTransaction(1, 200);
        bank.addTransaction(0, -50);
        Assertions.assertEquals(150, bank.getBalance());
    }

//   ensures that the Bank class can handle a single transaction
//   and the balance is calculated correctly.

    @Test
    public void shouldReturnZeroWithdrawalsCountIfNoWithdrawals() {
        Bank bank = new Bank(2);
        Assertions.assertEquals(0, bank.getWithdrawalsCount());
    }

//  checks if the getWithdrawalsCount() method returns 0 when there are
//  no withdrawals made from any of the cash machines in the bank.

    @Test
    public void shouldReturnCorrectWithdrawalsCount() {
        Bank bank = new Bank(2);
        bank.addTransaction(0, 100);
        bank.addTransaction(1, -50);
        bank.addTransaction(0, -200);
        Assertions.assertEquals(2, bank.getWithdrawalsCount());
    }

//  tests whether the number of withdrawals at the bank is correctly
//  summed up with the number of withdrawals of individual ATMs

    @Test
    public void shouldReturnZeroDepositsCountIfNoDeposits() {
        Bank bank = new Bank(2);
        Assertions.assertEquals(0, bank.getDepositsCount());
    }

//  verifies that the getDepositsCount() method of the Bank class
//  returns 0 when there are no deposits made in the cash machines
//  of the bank

    @Test
    public void shouldReturnZeroAverageWithdrawalIfNoWithdrawals() {
        Bank bank = new Bank(2);
        Assertions.assertEquals(0, bank.getAverageWithdrawal());
    }

//  verifies whether the getAverageWithdrawal method returns 0
//  if no withdrawals have been made in any of the cash machines

    @Test
    public void shouldReturnCorrectAverageWithdrawal() {
        Bank bank = new Bank(2);
        bank.addTransaction(0, -100);
        bank.addTransaction(1, -60);
        bank.addTransaction(0, -200);
        Assertions.assertEquals(-130, bank.getAverageWithdrawal());
    }

//  tests whether the average bank withdrawal is correctly
//  calculated based on individual ATM withdrawals

    @Test
    public void shouldReturnZeroAverageDepositIfNoDeposits() {
        Bank bank = new Bank(2);
        Assertions.assertEquals(0, bank.getAverageDeposit());
    }

//  checks whether the getAverageDeposit() method returns 0
//  if there are no deposits in the cash machines

    @Test
    public void shouldReturnCorrectAverageDeposit() {
        Bank bank = new Bank(2);
        bank.addTransaction(0, 100);
        bank.addTransaction(1, 100);
        bank.addTransaction(0, 200);
        Assertions.assertEquals(150, bank.getAverageDeposit());
    }

//  checks  if the getAverageDeposit() method returns the correct value
//  for a bank with multiple cash machines and multiple deposits

    @Test
    public void shouldReturnZeroNumberOfTransactionsIfNoTransactions() {
        Bank bank = new Bank(2);
        Assertions.assertEquals(0, bank.getNumberOfTransactions());
    }

//  checks if the getNumberOfTransactions() method returns 0
//  if no transactions have been made in the bank

    @Test
    public void shouldReturnCorrectNumberOfTransactions() {
        Bank bank = new Bank(2);
        bank.addTransaction(0, 100);
        bank.addTransaction(1, 50);
        bank.addTransaction(0, -200);
        Assertions.assertEquals(2, bank.getNumberOfTransactions());
    }

//   checks if the getNumberOfTransactions method returns the correct number
//   of all transactions made across all cash machines in the bank
}
