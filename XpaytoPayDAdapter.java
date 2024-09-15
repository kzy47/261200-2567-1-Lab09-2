package th.ac.cmu.cpe.oop.patterns.adapter.site;

import th.ac.cmu.cpe.oop.patterns.adapter.site.payd.PayD;
import th.ac.cmu.cpe.oop.patterns.adapter.site.xpay.Xpay;

public class XpaytoPayDAdapter implements PayD {
    private final Xpay xpay;

    public XpaytoPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }
    
    @Override
    public String getCreditCardNo() {
        return xpay.getCreditCardNo();
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        xpay.setCreditCardNo(creditCardNo);
    }

    @Override
    public String getCardOwnerName() {
        return xpay.getCustomerName();
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    @Override
    public String getCardExpMonthYear() {
        return xpay.getCardExpMonth() + "/" + xpay.getCardExpYear();
    }

    @Override
    public void setCardExpMonthYear(String cardExpMonthYear) {
        if (cardExpMonthYear.length() != 5 || cardExpMonthYear.charAt(2) != '/') {
            throw new IllegalArgumentException("Invalid date format. Expected MM/YY.");
        }
        xpay.setCardExpMonth(cardExpMonthYear.substring(0, 2));
        xpay.setCardExpYear(cardExpMonthYear.substring(3, 5));

    @Override
    public Integer getCVVNo() {
        return xpay.getCardCVVNo().intValue();
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        xpay.setCardCVVNo(cVVNo.shortValue());
    }

    @Override
    public Double getTotalAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        xpay.setAmount(totalAmount);
    }
}