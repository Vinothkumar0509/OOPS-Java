package utils;

public abstract class OrderFood {

   public abstract void prepare();
   public abstract void makeAPayment();
   public abstract void feedback(String input);

   //May or may not
   public void description()
   {
       System.out.println("Order Food Description");
   }

}
