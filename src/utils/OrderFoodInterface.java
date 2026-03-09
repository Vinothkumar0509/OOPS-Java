package utils;

public interface OrderFoodInterface {

     void prepare();
     void makeAPayment();
     void feedback(String input);

     default void defaultMethods()
    {

    }
}
