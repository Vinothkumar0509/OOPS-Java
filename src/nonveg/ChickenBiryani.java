package nonveg;

import invoice.CardDetails;
import invoice.Invoice;
import invoice.ProcessCardDetails;
import utils.OrderFoodInterface;
import utils.PrepareFoodItem;

public class ChickenBiryani extends PrepareFoodItem implements OrderFoodInterface {

    private static int quantity;

    public ChickenBiryani(int quantityFromInvoice) {
        this.quantity = quantityFromInvoice;
    }

    public ChickenBiryani() {
    }

    @Override
    public void prepare() {
        final double price = 240;
        double totalPrice = Invoice.calculateTotalPrice(price,"Chicken Biryani","Hyderabad SS");
        super.setPrepareFoodItem("ChickenBiryani", quantity, totalPrice);
        super.prepare();


//
    }

    @Override
    public void makeAPayment() {
        ProcessCardDetails processCardDetails = new ProcessCardDetails();
        CardDetails cardDetails = processCardDetails.processCard();
        if (cardDetails.isStatus()) {
            System.out.println("Logging Payment Info " + cardDetails);
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

