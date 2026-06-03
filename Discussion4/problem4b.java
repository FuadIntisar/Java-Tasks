package Discussion4;

class filterProducts {

    void Product (String catagory ) {
        System.out.println("Filtering products by category: " + catagory);
    }

    void Product (int mnP,int mxP ) {
        System.out.println("Filtering products by price: " + mnP + " to " + mxP);
    }

    void Product (String catagory, int mnP, int mxp ) {
        System.out.println("Filtering products by category and price: " + catagory + mnP + "to" + mxp);
    }

    void Product (String catagory, int mnP, int mxP, String brand){
        System.out.println("Filtering products by category: " + catagory + ", price range: " + mnP + " to " + mxP + ", brand: " + brand);
    }

}
public class problem4b {
    public static void main(String[] args) {
        filterProducts fp = new filterProducts();

        fp.Product("Fashion");
        fp.Product(100, 500);
        fp.Product("Nike",1000,5000);
        fp.Product("Electronics", 1000, 50000, "Apple");
    }
}
