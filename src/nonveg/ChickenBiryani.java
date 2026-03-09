package nonveg;

import invoice.Invoice;

import java.util.Scanner;

public class ChickenBiryani{

private int quantity;

public ChickenBiryani(int quantityFromInvoice) {
    this.quantity = quantityFromInvoice;
}

    public ChickenBiryani() {
    }

    public void prepare()
        {
        final int price = 240;
        System.out.print("Enter the Quantity: ");
        Scanner getQuantity = new Scanner(System.in);
        int quantity = getQuantity.nextInt();
        int totalPrice = Invoice.calculateTotalPrice(price,"ChickenBiryani");

//        System.out.println("Preparing Chicken-Biryani!");
        System.out.println("Order : Chicken-Biryani");
        System.out.println("Quantity : " + quantity);
        System.out.println("TotalPrice : " + totalPrice);

        System.out.println("Order Completed!!!");
        System.out.println("Preparing Chicken Biryani");
    }
    }

