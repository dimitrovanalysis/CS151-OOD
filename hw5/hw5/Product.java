/**
   A product with a price and description.
*/
public class Product implements LineItem
{
   /**
      Constructs a product.
      @param description the description
      @param price the price
   */
   public Product(String description, double price)
   {
      this.description = description;
      this.price = price;
      //this.quantity = quantity;
   }
   public double getPrice() { return price; }
   public String toString() { return description; }
   public int getQuantity() { return quantity;}
   public void increaseQuantity() {this.quantity = quantity + 1;}
   private String description;
   private double price;
   private int quantity;
}