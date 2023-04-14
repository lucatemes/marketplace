public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello world, this is a simple marketplace system. Useful for the organization of your own store.");
        
        //Products input
        
        Product orange= new Product( "Orange", "Orange fruit", 2, 10);
        Product banana= new Product( "Banana", "Banana fruit", 3, 10);

        //Stock input

        Stock day1= new Stock();
        day1.add(banana);
        day1.add(orange);

        //Products output

        day1.showAll();
        
    }
}
