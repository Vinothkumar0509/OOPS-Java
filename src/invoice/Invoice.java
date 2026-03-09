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
}
