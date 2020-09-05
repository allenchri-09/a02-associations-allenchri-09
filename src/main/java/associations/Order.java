package associations;
import java.util.ArrayList
public class Order {

//constants
 ArrayList<Order> orderItem;

    //  A constructor that initializes the account and an empty collection of items
public Order(){ }
this.item = new ArrayList<Order>();
}





  // getAccount() - Returns a reference to the Account object associated with this order

  // addItem(OrderItem item) - Adds an order item (above) to this order
  public void add(OrderItem item){
      itemlist.add(item);
  // getItems() - Returns an array of OrderItem object references listing all purchases
public Order[] itemArray = new Order[item.size()];
itemArray = orderItem.toArray(itemArray);
return itemArray;
  // getTotal() - Returns the price of all items purchased
    public double getTotal(){
        double sum = 0;
        for (Product prod : orderItem){
            sum = sum + prod.getPrice();
        }
        return sum;
      }
}
