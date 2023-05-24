package com.luxoft.bankapp.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.luxoft.bankapp.domain.Account;
import com.luxoft.bankapp.domain.AccountCache;
import com.luxoft.bankapp.domain.CheckingAccount;
import com.luxoft.bankapp.domain.SavingAccount;
import com.luxoft.bankapp.factory.AccountType;
import org.junit.Test;

public class TestAccountCache {
  @Test
  public void testSavingAccount() {
    AccountCache.loadCache();
    Account savingAccount = AccountCache.createAccount(AccountType.SAVING);
    assertTrue(savingAccount instanceof SavingAccount);
    assertEquals(savingAccount.getBalance(), 0.0, 0);
    assertEquals(savingAccount.getId(), 0);
  }

  @Test
  public void testCheckingAccount() {
    AccountCache.loadCache();
    Account checkingAccount = AccountCache.createAccount(AccountType.CHECKING);
    assertTrue(checkingAccount instanceof CheckingAccount);
    assertEquals(checkingAccount.getBalance(), 0.0, 0);
    assertEquals(checkingAccount.getId(), 0);
  }
}
