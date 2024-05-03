import java.util.List;
import java.util.Random;
import java.awt.Image;

public class Payment {
    private long recieptID;
    private Double applicableDiscount;
    private Double paymentAmount;

    public Payment(String membershipType, Double discount){
        switch (membershipType) {
            case "A": 
                this.paymentAmount = 10.00;
                break;
            case "B": 
                this.paymentAmount = 20.00;
                break;
            case "C": 
                this.paymentAmount = 35.00;
                break;
            default:
                this.paymentAmount = 0.00;
                break;
        }
        Random rand = new Random();
        long min = 1000000000000L; // will generate a random 13 digit number
        long max = 9999999999999L;
        this.recieptID = rand.nextLong() % (max - min + 1) + min;
    }

    public void processPayment() {
        API api = new API();
        api.authenicatePayment();
    }
    public String getPaymentDetails() {
        Double discountedAmount = paymentAmount - (paymentAmount* applicableDiscount);
        String paymentDetails = "Reciept No." + recieptID + ", Amount Paid: $" + discountedAmount; 
        return paymentDetails;
    }
}