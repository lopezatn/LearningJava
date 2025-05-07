public class DeluxeBurger extends Burger {
    private Item deluxeExtra1;
    private Item deluxeExtra2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addDeluxeExtras(String extra1, String extra2, String extra3,
            String extra4, String extra5) {
        this.deluxeExtra1 = new Item("TOPPING", extra1, 0);
        this.deluxeExtra2 = new Item("TOPPING", extra2, 0);
        addToppings(extra3, extra4, extra5);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxeExtra1 != null) {
            deluxeExtra1.printItem();
        }
        if (deluxeExtra2 != null) {
            deluxeExtra2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }

}
