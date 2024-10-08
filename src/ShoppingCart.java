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
    public static void main(String[]args)
    {
        Product[] products = new Product[10];
        for(Product p: products){
            System.out.println(p.getDescription());
        }
    }


}
