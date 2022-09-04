interface UserInterface {
    // Getters
    String getName();

    int getId();

    List<Item> getSoldItems();

    List<Item> getBoughtItems();

    List<Transaction> getTransactions();

    // Setters/Mutators
    void addSoldItem();
    
    void addBoughtItem();

    void addTransaction();

}
