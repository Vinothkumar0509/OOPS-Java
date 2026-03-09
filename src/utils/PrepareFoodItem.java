package utils;

public class PrepareFoodItem {

    protected String foodName;
    protected int quantity;
    protected int totalPrice;

    public void setPrepareFoodItem(String foodNameFromChildren, int quantityFromChildClass, int totalPricefromChild) {
        this.foodName = foodNameFromChildren;
        this.quantity = quantityFromChildClass;
        this.totalPrice = totalPricefromChild;
    }

    public void prepare()
    {
        System.out.println("Preparing "+foodName);
        System.out.println("Order "+foodName);
        System.out.println("Quantity : " + foodName);
        System.out.println("TotalPrice : " + totalPrice);

        System.out.println("Order Completed!!!");
    }
}
