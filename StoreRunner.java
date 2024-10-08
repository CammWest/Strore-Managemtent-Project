import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    Drinks tea = new Drinks("Brisk", 4, 400);

    //Asks for the brand of the drink
    System.out.println("What is the brand of the Drink?");
    String userBrand = input.nextLine();
    Drinks.setBrand(userBrand);

    //Asks for the price
    System.out.println("What is the price of the Drink?");
    double userPrice = input.nextDouble();
    Drinks.setPrice(userPrice);

    //Asks how much quantity the drink has
    System.out.println("What is the drink's quantity?");
    int userQuantity = input.nextInt();
    Drinks.setQuantity(userQuantity);

    System.out.println("-----------------------------");

    System.out.println("Brand: " + Drinks.getBrand());
    System.out.println("Price: " + Drinks.getPrice() + " $");
    System.out.println("Quantity: " + Drinks.getQuantity() + " oz");


    // Closes the Scanner object
    input.close();
    
  }
}