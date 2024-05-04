import java.util.Random;

public class Payment {
    private long receiptID;
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
        long min = 1000000000000L;
        long max = 9999999999999L;
        this.receiptID = rand.nextLong() % (max - min + 1) + min;
        this.applicableDiscount = discount; // Initialize the applicable discount
    }

    public void processPayment() {
        API api = new API();
        api.authenticatePayment();
    }

    public String getPaymentDetails() {
        Double discountedAmount = paymentAmount - (paymentAmount * applicableDiscount);
        String paymentDetails = "Receipt No." + receiptID + ", Amount Paid: $" + discountedAmount; 
        return paymentDetails;
    }
}
