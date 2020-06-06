package pjatk;

import java.util.*;

public interface AccountService {
    Optional<Account> findAccountByOwnerId(long id);

    Optional<Account> countAccountsWithBalanceGreaterThan(long value);
}
