package th.ac.cmu.cpe.oop.patterns.adapter.site;

import th.ac.cmu.cpe.oop.patterns.adapter.site.xpay.Xpay;

public class XpayImpl implements Xpay {
    private String cNo;
    private String customerName;
    private String cExpMonth;
    private String cExpYear;
    private Short cCVVNo;
    private Double amount;
    
    @Override
    public String getCreditCardNo() {
        return cNo;
    }

    @Override
    public void setCreditCardNo(String cNo) {
        this.cNo = cNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String getCardExpMonth() {
        return cExpMonth;
    }

    @Override
    public void setCardExpMonth(String cExpMonth) {
        this.cExpMonth = cExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return cExpYear;
    }

    @Override
    public void setCardExpYear(String cExpYear) {
        this.cExpYear = cExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return cCVVNo;
    }

    @Override
    public void setCardCVVNo(Short cCVVNo) {
        this.cCVVNo = cCVVNo;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}