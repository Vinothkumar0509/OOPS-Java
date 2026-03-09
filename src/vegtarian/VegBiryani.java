package vegtarian;

import invoice.Invoice;

public class VegBiryani {

    private int quantity;

    public VegBiryani(int quantityFromInvoice) {
        this.quantity = quantityFromInvoice;
    }

    public VegBiryani() {
    }

    public void prepare() {
        final int price = 180;

        int totalPrice = Invoice.calculateTotalPrice(price,"VegBiryani");

        System.out.println("Preparing Veg-Biryani!");
        System.out.println("Order : Veg-Biryani");
        System.out.println("Quantity : " + quantity);
        System.out.println("TotalPrice : " + totalPrice);

        System.out.println("Order Completed!!!");

    }
}

