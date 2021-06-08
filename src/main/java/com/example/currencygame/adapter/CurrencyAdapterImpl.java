package com.example.currencygame.adapter;

import com.example.currencygame.externalAPI.client.CurrencyClient;
import com.example.currencygame.externalAPI.pojo.CurrencyRates;
import com.example.currencygame.externalAPI.pojo.Rates;
import com.example.currencygame.model.Currency;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Component
public class CurrencyAdapterImpl implements CurrencyAdapter {

    private CurrencyClient currencyClient;

    public CurrencyAdapterImpl(CurrencyClient currencyClient) {
        this.currencyClient = currencyClient;
    }

    private List<Currency> currencies = new ArrayList<>();

    @EventListener(ApplicationReadyEvent.class)
    public void build() throws IOException {

        ResponseEntity<CurrencyRates> currency = currencyClient.getCurrency();
        Rates rates = currency.getBody().getRates();

        BigDecimal usd = new BigDecimal(rates.getUsd());
        currencies.add(new Currency("USD", usd));

        BigDecimal eur = new BigDecimal(rates.getEur());
        currencies.add(new Currency("EUR", eur));

        BigDecimal rub = new BigDecimal(rates.getRub());
        currencies.add(new Currency("RUB", rub));

        BigDecimal czk = new BigDecimal(rates.getCzk());
        currencies.add(new Currency("CZK", czk));
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }
}
