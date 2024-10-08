/*
 * Represents drinks that a Convinience Store sells
 */
public class Drinks {

  private String brand;      // The brand of the Drink
  private double price;     // The price of the Drink
  private int quantity;    // The quantity of your Drink

  /*
   * Sets the drink to "tea", price to 15, and quantity of the drink to 15
   */
  public Drinks() {
    this("tea", 15, 15);
  }

  /*
   * Sets Drink to the specified brand, price to the specified price
   and quantity to the specified quantity
   */
  public Drinks(String brand, double price, int quantity) {
    this.brand = brand;
    this.price = price;
    this.quantity = quantity;
  }

  /*
   * Returns the value assigned to brand
   */
  public String getBrand() {
    return brand;
  }

  /*
   * Returns the value assigned to price
   */
  public double getPrice() {
    return price;
  }

  /*
  * Returns the value assigned to quantity
  */ 
  public int getQuantity() {
    return quantity;
  }
  /*
   * Sets brand to newBrand
   */
  public void setBrand(String newBrand) {
    brand = newBrand;
  }

  /*
   * Sets price to newPrice
   */
  public void setPrice(double newPrice) {
    if (newPrice < 0) {
      price = 0;
    }
    else {
      price = newPrice;
    }
  }

  /*
  * Sets quantity to newQuantity
  */
  public void setQuantity(int newQuantity) {
    quantity = newQuantity;
  }
}