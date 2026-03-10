package utils;

//Parent Class
public class PrepareFoodItem {

    protected String foodName;
    protected int quantity;
    protected double totalPrice;

    public void setPrepareFoodItem(String foodNameFromChildren, int quantityFromChildClass, double totalPricefromChild) {
        this.foodName = foodNameFromChildren;
        this.quantity = quantityFromChildClass;
        this.totalPrice = totalPricefromChild;
    }

    public void prepare()
    {
        System.out.println("Preparing "+foodName);
        System.out.println("Order "+foodName);
        System.out.println("Quantity : " + quantity);
        System.out.println("TotalPrice : " + totalPrice);

        System.out.println("Order Completed!!!");
    }
}
