package com.example.currencygame.externalAPI.client;

import com.example.currencygame.externalAPI.pojo.CurrencyRates;
import com.example.currencygame.adapter.CurrencyAdapterImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.EventListener;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class CurrencyClient {

    private final String URL_CURRENCY = "https://api.vatcomply.com/rates?base=PLN";

    private RestTemplate restTemplate;

    private CurrencyAdapterImpl currencyAdapterImpl;

    @Autowired
    public CurrencyClient(@Lazy CurrencyAdapterImpl currencyAdapterImpl) {
        this.currencyAdapterImpl = currencyAdapterImpl;
        this.restTemplate = new RestTemplate();
    }

    @EventListener(ApplicationReadyEvent.class)
    public ResponseEntity<CurrencyRates> getCurrency() throws JsonProcessingException {

        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) " +
                "Chrome/90.0.4430.212 Safari/537.36");

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<CurrencyRates> exchange = restTemplate.exchange(
                URL_CURRENCY,
                HttpMethod.GET,
                entity,
                CurrencyRates.class);
        return exchange;
    }
}
