public class Book extends Product
{
    String name, description;
    int price;

    public Book(String name, int price, String description)
    {
        super(name,price,description);
        this.name = name;
        this.price = price;
        this.description = description;
    }
    @Override
    public String getName(){
        return ("nameBook!");
    }
    @Override
    public int getPrice(){
        return (50);
    }
    @Override
    public String getDescription(){
        return ("descriptionBook!");
    }
}
