public class Product{
    private int id;
    private String name;
    private String desc;
    private double price;
    private int quantity;

    public Product(String name, String desc, double price,int quantity){
        this.id++;
        this.name=name;
        this.desc=desc;
        this.quantity=quantity;
        this.price= price;
    }

    public int getID(){
        return id;
    }

    public void setID(int idd){
        id= idd;
    }

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    public int getQtd(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }
}