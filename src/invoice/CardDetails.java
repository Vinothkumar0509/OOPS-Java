package invoice;

import java.util.Objects;
import java.util.Optional;

public class CardDetails {

    private String name;
    private long cardNo;
    private String pin;
    private boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardNo() {
        return cardNo;
    }

    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        if(cardNo== 123456 && "1234".equals(pin))
        {
            this.status = true;
        }
        else{
            this.status = false;
        }

    }

    @Override
    public String toString() {
        return "CardDetails{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", status=" + status +
                '}';
    }
}
