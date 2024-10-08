/*
 * Represents water that can be sold at the Convineince Store
 * Water has pH and temp
 */
public class Water extends Drinks {
  
  private double pH;   //pH level of the water
  private int temp;   //temperature of the water

  /*
   * Sets the water's pH to 9.8, price to 15
   */
  public Water() {
    this(9.8, 15);
  }
  
  /*
   * Sets the brand to the specified brand, the price to the
   * specified price, the quantity to the specified quantity, pH 
   *to the specified level, and temp to the specified temperature
   */
  public Water(String brand, double price, int quantity, double pH, int temp) {
    super(brand, price, quantity);
    this.pH = pH;
    this.temp = temp;
  }

  /*
   * Returns the value assigned to pH
   */
  public double getPH() {
    return pH;
  }

  /*
   * Returns the value assigned to temp
   */
  public int getTemp() {
    return temp;
  }
  
  /*
   * Sets pH to newPH
   */
  public void setPH(double newPH) {
    pH = newPH;
  }

  /*
   * Sets temp to newTemp
   */
  public void setTemp(int newTemp) {
    temp = newTemp;
  }
}