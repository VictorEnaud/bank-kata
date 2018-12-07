import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {
    @Test
    void initially_should_have_balance_set_to_zero() {
        

        assertThat(account.balance).isEqualTo(0);
    }
}