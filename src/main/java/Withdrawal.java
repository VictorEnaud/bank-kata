class Withdrawal extends Movement {
    Withdrawal(double amount, String date) {
        super(amount, date);
    }

    @Override
    double computeNewBalance(double currentBalance) {
        return currentBalance - this.amount;
    }
}
