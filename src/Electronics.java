public class Electronics extends Product{
    String name, description;
    int price;

    public Electronics(String name, int price, String description)
    {
        super(name,price,description);
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName(){
        return ("nameElectronics!");
    }
    @Override
    public int getPrice(){
        return (2000);
    }
    @Override
    public String getDescription(){
        return ("descriptionElectronics!");
    }
}
