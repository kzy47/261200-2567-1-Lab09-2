import th.ac.cmu.cpe.oop.patterns.adapter.site.XpayImpl;
import th.ac.cmu.cpe.oop.patterns.adapter.site.XpaytoPayDAdapter;
import th.ac.cmu.cpe.oop.patterns.adapter.site.payd.PayD;
import th.ac.cmu.cpe.oop.patterns.adapter.site.xpay.Xpay;

public class Main {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("1234-5678-9012-3456");
        xpay.setCustomerName("Moo Dang");
        xpay.setCardExpMonth("10");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 123);
        xpay.setAmount(2000);
        
        PayD payD = new XpaytoPayDAdapter(xpay);
        
        System.out.println("Card Owner: " + payD.getCardOwnerName());
        System.out.println("Card Expiry: " + payD.getCardExpMonthYear());
        System.out.println("CVV: " + payD.getCVVNo());
        System.out.println("Total Amount: " + payD.getTotalAmount());
    }
}
