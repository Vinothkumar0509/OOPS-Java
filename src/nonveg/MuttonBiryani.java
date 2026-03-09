package nonveg;

import invoice.Invoice;

import java.util.Scanner;

public class MuttonBiryani {

    private int quantity;
    public MuttonBiryani(int quantityFromInvoice)
    {
        this.quantity = quantityFromInvoice;
    }

    public MuttonBiryani() {
    }

    public void prepare() {
        final int price = 320;
        System.out.print("Enter the Quantity: ");
        Scanner getQuantity = new Scanner(System.in);
        int quantity = getQuantity.nextInt();
        int totalPrice = Invoice.calculateTotalPrice(price,"MuttonBiryani");


//        System.out.println("Preparing Mutton-Biryani!");
        System.out.println("Order : Mutton-Biryani");
        System.out.println("Quantity : " + quantity);
        System.out.println("TotalPrice : " + totalPrice);

        System.out.println("Order Completed!!!");
        System.out.println("Preparing Mutton Biryani");


    }
}
