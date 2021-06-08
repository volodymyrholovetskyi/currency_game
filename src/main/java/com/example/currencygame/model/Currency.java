package com.example.currencygame.model;

import java.math.BigDecimal;

public class Currency {

   private String currencyName;

   private BigDecimal currency;

    public Currency(String currencyName, BigDecimal currency) {
        this.currencyName = currencyName;
        this.currency = currency;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public BigDecimal getCurrency() {
        return currency;
    }

    public void setCurrency(BigDecimal currency) {
        this.currency = currency;
    }
}
