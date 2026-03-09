package nonveg;

import invoice.CardDetails;
import invoice.Invoice;
import invoice.ProcessCardDetails;
import utils.OrderFoodInterface;
import utils.PrepareFoodItem;

import java.util.Scanner;

public class ChickenBiryani extends PrepareFoodItem implements OrderFoodInterface {

    private int quantity;

    public ChickenBiryani(int quantityFromInvoice) {
        this.quantity = quantityFromInvoice;
    }

    public ChickenBiryani() {
    }


    public void prepare() {
        final int price = 240;
        System.out.print("Enter the Quantity: ");
        Scanner getQuantity = new Scanner(System.in);
        int quantity = getQuantity.nextInt();
        int totalPrice = Invoice.calculateTotalPrice(price, "ChickenBiryani");
        super.setPrepareFoodItem("ChickenBiryani", quantity, totalPrice);
        super.prepare();


//
    }

    @Override
    public void makeAPayment() {
        ProcessCardDetails processCardDetails = new ProcessCardDetails();
        CardDetails cardDetails = processCardDetails.processCard();
        if (cardDetails.isStatus()) {
            System.out.println("Login Payment Info " + cardDetails);
            System.out.println("Order Payment Completed!!!");
        } else {
            System.out.println("Order Payment Failed!!!");
            System.exit(0);
        }

    }

    @Override
    public void feedback(String input) {
        System.out.println("Feedback: " + input);

    }
}

