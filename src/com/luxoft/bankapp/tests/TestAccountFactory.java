package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.domain.Account;
import com.luxoft.bankapp.domain.CheckingAccount;
import com.luxoft.bankapp.domain.SavingAccount;
import com.luxoft.bankapp.factory.AccountFactory;
import com.luxoft.bankapp.factory.AccountType;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAccountFactory {
  @Test
  public void createSavingAccount_returnsSavingAccountInstance() {
    Account savingAccount = AccountFactory.createNewAccount(AccountType.SAVING, 1, 100);
    assertTrue(savingAccount instanceof SavingAccount);
  }

  @Test
  public void createCheckingAccount_returnsCheckingAccountInstance() {
    Account checkingAccount = AccountFactory.createNewAccount(AccountType.CHECKING, 1, 100);
    assertTrue(checkingAccount instanceof CheckingAccount);
  }
}
