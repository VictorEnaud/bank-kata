import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {
    @Test
    void shouldHaveAVoidStatement_onInit() {
        // When
        Account account = new Account();

        // Then
        assertThat(account.generateStatement()).isEqualTo("date || credit || debit || balance");
    }

    @Test
    void shouldAddANewLineToStatement_onDeposit() {
        // Given
        Account account = new Account();

        // When
        account.deposit();

        // Then
        assertThat(account.generateStatement()).isEqualTo("date || credit || debit || balance\n || || || ");
    }
}