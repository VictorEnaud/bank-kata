abstract class Movement {
    double amount;
    String date;

    Movement(double amount, String date) {
        this.amount = amount;
    }

    abstract double computeNewBalance (double currentBalance);
}
