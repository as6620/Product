public class Clothing extends Product{
    String name, description;
    int price;

    public Clothing(String name, int price, String description)
    {
        super(name,price,description);
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName(){
        return ("nameClothing!");
    }
    @Override
    public int getPrice(){
        return (200);
    }
    @Override
    public String getDescription(){
        return ("descriptionClothing!");
    }
}
