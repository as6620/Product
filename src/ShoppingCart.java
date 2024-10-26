public class ShoppingCart extends Product{
    String name, description;
    int price;

    public ShoppingCart(String name, int price, String description)
    {
        super(name,price,description);
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int calculateTotal() {
        Product[] products = new Product[10];
    }
}
