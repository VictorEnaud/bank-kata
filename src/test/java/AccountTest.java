import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {
    @Test
    void shouldHaveAVoidStatement_onInit() {
        // When
        Account account = new Account();

        // Then
        String actual = account.generateStatement();
        assertThat(actual).isEqualTo("date || credit || debit || balance");
    }
}