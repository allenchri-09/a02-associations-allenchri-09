package associations;

public class OrderItem {
    private Product prod;
    private int quantity;
    private double price;


  // A constructor that initializes the product and quantity
    public OrderItem(Product prod, int quantity, int price){
        this.prod = prod;
        this.quantity = quantity;
        this.price = price;
    }
  // getProduct() - Returns a reference to the Product object purchased
    public Product getProduct(){return prod;}

  // getQuantity() - Returns an integer indicating how many products were purchased
    public int getQuantity(){return quantity;}

  // getPrice() - Returns the price of this item, based on the unit price of the product and the quantity
    public double getPrice(){return price*quantity;}
}
