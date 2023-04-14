import java.util.ArrayList;
public class Stock{
    private ArrayList<Product> products= new ArrayList<>();
    private int id;
    public void add(Product oneProduct){
        products.add(oneProduct);
        id++;
        oneProduct.setID(id);
    }

    public void showAll(){
        for(Product list: products){
            System.out.println("----------------");
            System.out.print("Product: ");
            System.out.println(list.getName());
            System.out.print("Price: ");
            System.out.println(list.getPrice());
            System.out.print("ID: ");
            System.out.println(list.getID());
            System.out.print("Description: ");
            System.out.println(list.getDesc());
            System.out.print("Quantity: ");
            System.out.println(list.getQtd());

        }
    }

}
