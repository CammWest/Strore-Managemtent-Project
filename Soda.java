/*
 * Represents soda that can be sold at the Convineince Store
 * Soda has sugar and flavor
 */
public class Soda extends Drinks {
  
  private String flavor;     //flavor of the soda
  private int sugar;        //amt of sugar in the soda

  /*
   * Sets the soda's flavor to "fiji", sugar amt to 15
   */
  public Soda() {
    this("Orange", 15);
  }
  
  /*
   * Sets the brand to the specified brand, the price to the
   * specified price, the quantity to the specified quantity, flavor 
   *to the specified flavor, and sugar to the specified amount
   */
  public Soda(String brand, double price, int quantity, String flavor, int sugar) {
    super(brand, price, quantity);
    this.flavor = flavor;
    this.sugar = sugar;
  }

  /*
   * Returns the value assigned to flavor
   */
  public String getFlavor() {
    return flavor;
  }

  /*
   * Returns the value assigned to sugar
   */
  public int getSugar() {
    return sugar;
  }
  
  /*
   * Sets flavor to newFlavor
   */
  public void setFlavor(String newFlavor) {
    flavor = newFlavor;
  }

  /*
   * Sets sugar to newSugar
   */
  public void setSugar(int newSugar) {
    sugar = newSugar;
  }
}