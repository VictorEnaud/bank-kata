class Account {
    double balance = 0;

    void addMovement(Movement movement) {
        balance = movement.computeNewBalance(balance);
    }
}
