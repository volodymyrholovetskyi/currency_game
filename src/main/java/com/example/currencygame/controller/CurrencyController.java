package com.example.currencygame.controller;

import com.example.currencygame.externalAPI.client.CurrencyClient;
import com.example.currencygame.adapter.CurrencyAdapterImpl;
import com.example.currencygame.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;


@Controller
public class CurrencyController {

    private CurrencyClient currencyClient;


    private CurrencyAdapterImpl currencyAdapterImpl;

    private CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyClient currencyClient, CurrencyAdapterImpl currencyAdapterImpl, CurrencyService currencyService) {
        this.currencyClient = currencyClient;
        this.currencyAdapterImpl = currencyAdapterImpl;
        this.currencyService = currencyService;
    }

    @GetMapping("/game")
    public String getCurrency(Model model) {
        return "game";
    }

    @GetMapping("currencies/game")
    public String getGame(Model model) {
        String currencyName = currencyService.getCurrencyName();
        model.addAttribute("currencyName", currencyName);
        return "currency_game";
    }

    @GetMapping("/currencies/rate")
    public String showCurrencyByValue(@RequestParam(defaultValue = "0") double currency, Model model) {
        String currencyName = currencyService.getCurrencyName();
        model.addAttribute("currencyName", currencyName);
            String currencyRate = currencyService.checkingTheUserCurrency(currency);
            model.addAttribute("currency", currencyRate);
        return "currency_rate";
    }
}
