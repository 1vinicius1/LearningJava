package services;

public class PaypalService implements OnlinePaymentService {

    public Double paymentFee(double amount){
        return amount * 0.02;
    }
    public Double interest(double amount, int months){
        return (amount * months) * 0.01;
    }
}
