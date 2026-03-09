package vegtarian;

import invoice.CardDetails;
import invoice.Invoice;
import invoice.ProcessCardDetails;
import utils.OrderFood;
import utils.PrepareFoodItem;

import javax.smartcardio.Card;
//Parent Class and Example for abstraction
public class VegBiryani extends OrderFood {

    private int quantity;

    public VegBiryani(int quantityFromInvoice) {
        this.quantity = quantityFromInvoice;
    }

    public VegBiryani() {
    }


    public void prepare() {
        final int price = 180;
        int totalPrice = Invoice.calculateTotalPrice(price,"VegBiryani");
//        super.setPrepareFoodItem("VegBiryani",quantity,totalPrice);
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

