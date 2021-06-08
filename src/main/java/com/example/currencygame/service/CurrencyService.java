package com.example.currencygame.service;

import com.example.currencygame.adapter.CurrencyAdapter;
import com.example.currencygame.adapter.CurrencyAdapterImpl;
import com.example.currencygame.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

@Service
public class CurrencyService {

    private static int quantity;

    private BigDecimal random;

    private String currencyName;

    private CurrencyAdapter currencyAdapter;

    @Autowired
    public CurrencyService(CurrencyAdapterImpl currencyAdapter) {
        this.currencyAdapter = currencyAdapter;
    }

    @EventListener(ApplicationReadyEvent.class)
    public BigDecimal getCurrencyRandom() {

        List<Currency> currencies = currencyAdapter.getCurrencies();
        int randomIndex = new Random().nextInt(currencies.size());
        Currency currency = currencies.get(randomIndex);
        BigDecimal generateCurrency = currency.getCurrency();
        currencyName = currency.getCurrencyName();
        random = generateCurrency;
        return generateCurrency;
    }

    public String checkingTheUserCurrency(double currencyTheUser) {

        quantity += 1;

        double currencyRandom = random.setScale(
                2
                ,BigDecimal.ROUND_DOWN)
                .doubleValue();

        String result = new String();

        if (currencyTheUser > currencyRandom) {
            result = String.format("Podałeś za dużą liczbę");
        } else if (currencyTheUser < currencyRandom) {
            result = String.format("Podałeś za małą liczbę");
        } else if (currencyTheUser == currencyRandom) {
            result = String.format("Gratulacje, udało ci się za: %s razem!", quantity);
            quantity = 0;
            getCurrencyRandom();
        }
        return result;
    }

    public String getCurrencyName() {
        return currencyName;
    }
}
