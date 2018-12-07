import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountShould {
    @Test
    void initially_have_balance_set_to_zero() {
        Account account = new Account();

        assertThat(account.balance).isEqualTo(0);
    }

    @Test
    void when_deposits_balance_increases() {
        String date = "20181207";
        Account account = new Account();

        account.addMovement(new Deposit(1000, date));
        assertThat(account.balance).isEqualTo(1000);

        account.addMovement(new Deposit(100, date));
        assertThat(account.balance).isEqualTo(1100);
    }

    @Test
    void when_withdrawals_balance_decreases() {
        String date = "20181207";
        Account account = new Account();

        account.addMovement(new Withdrawal(1000, date));
        assertThat(account.balance).isEqualTo(-1000);
    }
}