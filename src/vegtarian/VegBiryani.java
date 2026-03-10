package vegtarian;

import invoice.CardDetails;
import invoice.Invoice;
import invoice.ProcessCardDetails;
import utils.OrderFood;
import utils.PrepareFoodItem;

//Parent Class and Example for abstraction
public class VegBiryani extends OrderFood {

    private static int quantity;

    public VegBiryani(int quantityFromInvoice) {
        this.quantity = quantityFromInvoice;
    }

    public VegBiryani() {
    }


    public void prepare() {
        final int price = 180;
        double totalPrice = Invoice.calculateTotalPrice(price,"VegBiryani");
//        super.setPrepareFoodItem("VegBiryani",quantity,totalPrice);

        System.out.println("Preparing VegBiryani");
        System.out.println("Order: VegBiryani");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + totalPrice);

        System.out.println("Order Completed!!!");
    }

    public void makeAPayment() {
        //Name, Account number, Card Number,Pin,password -> CardDetails

        ProcessCardDetails processCardDetails = new ProcessCardDetails();
        CardDetails cardDetails = processCardDetails.processCard();
        if(cardDetails.isStatus()){
            System.out.println("Login Payment Info "+ cardDetails);
            System.out.println("Order Payment Completed!!!");
        }else
        {
            System.out.println("Order Payment Failed!!!");
            System.exit(0);
        }


    }

    @Override
    public void feedback(String input) {
        System.out.println("Feedback: " + input);

    }
}

