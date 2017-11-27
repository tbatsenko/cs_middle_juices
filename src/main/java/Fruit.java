public enum Fruit {
    APPLE("apple"), GRAPE("grape"), PEAR("pear");

    private String name;

    Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
