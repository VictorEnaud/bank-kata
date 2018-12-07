class Deposit extends Movement {
    Deposit(double amount, String date) {
        super(amount, date);
    }

    @Override
    double computeNewBalance(double currentBalance) {
        return currentBalance + this.amount;
    }
}
