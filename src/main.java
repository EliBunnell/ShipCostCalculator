import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        double itemPrice = 0.0;
        final double SHIP_RATE = 0.02;
        final double FREE_SHIP = 100.0;
        double shipCost = 0.0;
        double totalCost = 0.0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the item price: ");
        if(in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= FREE_SHIP) {

                shipCost = 0;
                totalCost = itemPrice;
            }
            else {
                shipCost = itemPrice * SHIP_RATE;
                totalCost = itemPrice + shipCost;
            }

            System.out.println("Total cost: " + totalCost);
        }
            else {
                trash = in.nextLine();
            System.out.println("Invalid item price: " + trash);
            System.out.println("Exiting...");
            System.exit(0);

        }



    }
}
