package invoice;

import nonveg.ChickenBiryani;
import nonveg.MuttonBiryani;
import vegtarian.VegBiryani;

import java.util.Scanner;

public class Invoice {

    public static int calculateTotalPrice(int price,String foodName)
    {
        System.out.print("Enter the Quantity: ");
        Scanner getQuantity = new Scanner(System.in);
        int quantity = getQuantity.nextInt();
        if(foodName.equals("VegBiryani"))
        {
            VegBiryani vegBiryani = new VegBiryani(quantity);
        }
        else if(foodName.equals("ChickenBiryani"))
        {
            ChickenBiryani chickenBiryani = new ChickenBiryani(quantity);
        }
        else if(foodName.equals("MuttonBiryani"))
        {
            MuttonBiryani muttonBiryani = new MuttonBiryani(quantity);
        }

        return price * quantity;
    }

    // Method Overloading
    public static double calculateTotalPrice(double price, String foodName, String brandName) {
        System.out.print("Enter the Quantity: ");
        Scanner getQuantity = new Scanner(System.in);
        int quantity = getQuantity.nextInt();
        if(foodName.equals("VegBiryani")) {
            VegBiryani vegBiryani = new VegBiryani(quantity);
        } else if(foodName.equals("Chicken Biryani")) {
            ChickenBiryani chickenBiryani = new ChickenBiryani(quantity);

        } else if(foodName.equals("Mutton Biryani")) {
            MuttonBiryani muttonBiryani = new MuttonBiryani(quantity);
        }

        return quantity * price;
    }

}
