package pjatk;


import java.util.*;


public class AccountServiceImpl implements AccountService {
    public AccountServiceImpl() {
        Account account;
    }

    Account account;
    List<Account> accountList = new ArrayList<>();

    void addAccount(long id, long balance, User owner) {
        Account myAccount = new Account(id, balance, owner);
        accountList.add(myAccount);
    }


    public List<Account> findAll() {
        return this.accountList;
    }

    @Override
    public Optional<Account> findAccountByOwnerId(long id) {


        return accountList.stream().filter(acc -> acc.getId() == id).findFirst();


    }

    @Override
    public Optional<Account> countAccountsWithBalanceGreaterThan(long value) {
        return accountList.stream().filter(acc -> acc.getBalance() > value).findFirst();
    }
}
