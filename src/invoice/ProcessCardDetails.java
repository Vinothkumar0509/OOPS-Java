package invoice;
import exception.InvalidPinFoundException;
import java.util.Scanner;

public class ProcessCardDetails {

    public CardDetails processCard() {
        System.out.print("Enter Name:");
        Scanner getName = new Scanner(System.in);
        String name = getName.next();

        System.out.print("Enter CardNo:");
        Scanner getCardNo= new Scanner(System.in);
        long cardNo = getCardNo.nextLong();

        System.out.print("Enter Your Pin:");
        Scanner getPin = new Scanner(System.in);
        String pin= getPin.next();

        if(pin.length()!=4){
            throw new InvalidPinFoundException("Invalid Pin Observed :"+pin);
        }

        CardDetails cardDetails = new CardDetails();
        cardDetails.setName(name);
        cardDetails.setCardNo(cardNo);
        cardDetails.setPin(pin);

        cardDetails.setStatus(false);
        return cardDetails;

    }
}
