package nonveg;

import invoice.CardDetails;
import invoice.Invoice;
import invoice.ProcessCardDetails;
import utils.OrderFoodInterface;
import utils.PrepareFoodItem;

import java.util.Scanner;
//Interface example
public class MuttonBiryani extends PrepareFoodItem implements OrderFoodInterface {

    private static int quantity;


    public MuttonBiryani() {
    }

    public MuttonBiryani(int quantityFromInvoice) {
        quantity = quantityFromInvoice;
    }


    @Override
    public void prepare() {
        final int price = 320;
        double totalPrice = Invoice.calculateTotalPrice(price, "MuttonBiryani");
        super.setPrepareFoodItem("MuttonBiryani", quantity, totalPrice);
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
