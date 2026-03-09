package invoice;

import nonveg.ChickenBiryani;
import nonveg.MuttonBiryani;
import vegtarian.VegBiryani;

import java.util.Scanner;

public class Invoice {

    public static int calculateTotalPrice(int price,String foodname)
    {
        System.out.print("Enter the Quantity: ");
        Scanner getQuantity = new Scanner(System.in);
        int quantity = getQuantity.nextInt();
        if(foodname.equals("VegBiryani"))
        {
            VegBiryani vegBiryani = new VegBiryani(quantity);
        }
        else if(foodname.equals("ChickenBiryani"))
        {
            ChickenBiryani chickenBiryani = new ChickenBiryani(quantity);
        }
        else if(foodname.equals("MuttonBiryani"))
        {
            MuttonBiryani muttonBiryani = new MuttonBiryani(quantity);
        }

        return price * quantity;
    }
}
