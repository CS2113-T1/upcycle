class User implements UserInterface {
    private final String name;
    private final int id;
    private final List<Item> soldItems = new ArrayList<Item>();
    private final List<Item> boughtItems = new ArrayList<Item>();
    private final List<Transaction> transactions = new ArrayList<Transaction>();

    User(String name, int id) {
        this.name = name;
        this.id = id;
    }    

    private final String getName() {
        return this.name;
    }

    private final int getId() {
        return this.id;
    }

    private final List<Item> getSoldItems() {
        return new ArrayList<Item>(this.soldItems);
    }

    private final List<Item> getBoughtItems() {
        return new ArrayList<Item>(this.boughtItems);
    }

    private final List<Transaction> getTransactions() {
        return new ArrayList<Transaction>(this.transactions);
    }

    private final void addSoldItem(Item item) {
        this.soldItems.add(item);
    }

    private final void addBoughtItem(Item item) {
        this.boughtItems.add(item);
    }

    private final void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    @Override
    public String toString() {
        return "User " + this.getName() + " created";
    }
}
