
package com.example.currencygame.externalAPI.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EUR",
    "USD",
    "JPY",
    "BGN",
    "CZK",
    "DKK",
    "GBP",
    "HUF",
    "PLN",
    "RON",
    "SEK",
    "CHF",
    "ISK",
    "NOK",
    "HRK",
    "RUB",
    "TRY",
    "AUD",
    "BRL",
    "CAD",
    "CNY",
    "HKD",
    "IDR",
    "ILS",
    "INR",
    "KRW",
    "MXN",
    "MYR",
    "NZD",
    "PHP",
    "SGD",
    "THB",
    "ZAR"
})
@Generated("jsonschema2pojo")
public class Rates {

    @JsonProperty("EUR")
    private Double eur;
    @JsonProperty("USD")
    private Double usd;
    @JsonProperty("JPY")
    private Double jpy;
    @JsonProperty("BGN")
    private Double bgn;
    @JsonProperty("CZK")
    private Double czk;
    @JsonProperty("DKK")
    private Double dkk;
    @JsonProperty("GBP")
    private Double gbp;
    @JsonProperty("HUF")
    private Double huf;
    @JsonProperty("PLN")
    private Double pln;
    @JsonProperty("RON")
    private Double ron;
    @JsonProperty("SEK")
    private Double sek;
    @JsonProperty("CHF")
    private Double chf;
    @JsonProperty("ISK")
    private Double isk;
    @JsonProperty("NOK")
    private Double nok;
    @JsonProperty("HRK")
    private Double hrk;
    @JsonProperty("RUB")
    private Double rub;
    @JsonProperty("TRY")
    private Double _try;
    @JsonProperty("AUD")
    private Double aud;
    @JsonProperty("BRL")
    private Double brl;
    @JsonProperty("CAD")
    private Double cad;
    @JsonProperty("CNY")
    private Double cny;
    @JsonProperty("HKD")
    private Double hkd;
    @JsonProperty("IDR")
    private Double idr;
    @JsonProperty("ILS")
    private Double ils;
    @JsonProperty("INR")
    private Double inr;
    @JsonProperty("KRW")
    private Double krw;
    @JsonProperty("MXN")
    private Double mxn;
    @JsonProperty("MYR")
    private Double myr;
    @JsonProperty("NZD")
    private Double nzd;
    @JsonProperty("PHP")
    private Double php;
    @JsonProperty("SGD")
    private Double sgd;
    @JsonProperty("THB")
    private Double thb;
    @JsonProperty("ZAR")
    private Double zar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EUR")
    public Double getEur() {
        return eur;
    }

    @JsonProperty("EUR")
    public void setEur(Double eur) {
        this.eur = eur;
    }

    @JsonProperty("USD")
    public Double getUsd() {
        return usd;
    }

    @JsonProperty("USD")
    public void setUsd(Double usd) {
        this.usd = usd;
    }

    @JsonProperty("JPY")
    public Double getJpy() {
        return jpy;
    }

    @JsonProperty("JPY")
    public void setJpy(Double jpy) {
        this.jpy = jpy;
    }

    @JsonProperty("BGN")
    public Double getBgn() {
        return bgn;
    }

    @JsonProperty("BGN")
    public void setBgn(Double bgn) {
        this.bgn = bgn;
    }

    @JsonProperty("CZK")
    public Double getCzk() {
        return czk;
    }

    @JsonProperty("CZK")
    public void setCzk(Double czk) {
        this.czk = czk;
    }

    @JsonProperty("DKK")
    public Double getDkk() {
        return dkk;
    }

    @JsonProperty("DKK")
    public void setDkk(Double dkk) {
        this.dkk = dkk;
    }

    @JsonProperty("GBP")
    public Double getGbp() {
        return gbp;
    }

    @JsonProperty("GBP")
    public void setGbp(Double gbp) {
        this.gbp = gbp;
    }

    @JsonProperty("HUF")
    public Double getHuf() {
        return huf;
    }

    @JsonProperty("HUF")
    public void setHuf(Double huf) {
        this.huf = huf;
    }

    @JsonProperty("PLN")
    public Double getPln() {
        return pln;
    }

    @JsonProperty("PLN")
    public void setPln(Double pln) {
        this.pln = pln;
    }

    @JsonProperty("RON")
    public Double getRon() {
        return ron;
    }

    @JsonProperty("RON")
    public void setRon(Double ron) {
        this.ron = ron;
    }

    @JsonProperty("SEK")
    public Double getSek() {
        return sek;
    }

    @JsonProperty("SEK")
    public void setSek(Double sek) {
        this.sek = sek;
    }

    @JsonProperty("CHF")
    public Double getChf() {
        return chf;
    }

    @JsonProperty("CHF")
    public void setChf(Double chf) {
        this.chf = chf;
    }

    @JsonProperty("ISK")
    public Double getIsk() {
        return isk;
    }

    @JsonProperty("ISK")
    public void setIsk(Double isk) {
        this.isk = isk;
    }

    @JsonProperty("NOK")
    public Double getNok() {
        return nok;
    }

    @JsonProperty("NOK")
    public void setNok(Double nok) {
        this.nok = nok;
    }

    @JsonProperty("HRK")
    public Double getHrk() {
        return hrk;
    }

    @JsonProperty("HRK")
    public void setHrk(Double hrk) {
        this.hrk = hrk;
    }

    @JsonProperty("RUB")
    public Double getRub() {
        return rub;
    }

    @JsonProperty("RUB")
    public void setRub(Double rub) {
        this.rub = rub;
    }

    @JsonProperty("TRY")
    public Double getTry() {
        return _try;
    }

    @JsonProperty("TRY")
    public void setTry(Double _try) {
        this._try = _try;
    }

    @JsonProperty("AUD")
    public Double getAud() {
        return aud;
    }

    @JsonProperty("AUD")
    public void setAud(Double aud) {
        this.aud = aud;
    }

    @JsonProperty("BRL")
    public Double getBrl() {
        return brl;
    }

    @JsonProperty("BRL")
    public void setBrl(Double brl) {
        this.brl = brl;
    }

    @JsonProperty("CAD")
    public Double getCad() {
        return cad;
    }

    @JsonProperty("CAD")
    public void setCad(Double cad) {
        this.cad = cad;
    }

    @JsonProperty("CNY")
    public Double getCny() {
        return cny;
    }

    @JsonProperty("CNY")
    public void setCny(Double cny) {
        this.cny = cny;
    }

    @JsonProperty("HKD")
    public Double getHkd() {
        return hkd;
    }

    @JsonProperty("HKD")
    public void setHkd(Double hkd) {
        this.hkd = hkd;
    }

    @JsonProperty("IDR")
    public Double getIdr() {
        return idr;
    }

    @JsonProperty("IDR")
    public void setIdr(Double idr) {
        this.idr = idr;
    }

    @JsonProperty("ILS")
    public Double getIls() {
        return ils;
    }

    @JsonProperty("ILS")
    public void setIls(Double ils) {
        this.ils = ils;
    }

    @JsonProperty("INR")
    public Double getInr() {
        return inr;
    }

    @JsonProperty("INR")
    public void setInr(Double inr) {
        this.inr = inr;
    }

    @JsonProperty("KRW")
    public Double getKrw() {
        return krw;
    }

    @JsonProperty("KRW")
    public void setKrw(Double krw) {
        this.krw = krw;
    }

    @JsonProperty("MXN")
    public Double getMxn() {
        return mxn;
    }

    @JsonProperty("MXN")
    public void setMxn(Double mxn) {
        this.mxn = mxn;
    }

    @JsonProperty("MYR")
    public Double getMyr() {
        return myr;
    }

    @JsonProperty("MYR")
    public void setMyr(Double myr) {
        this.myr = myr;
    }

    @JsonProperty("NZD")
    public Double getNzd() {
        return nzd;
    }

    @JsonProperty("NZD")
    public void setNzd(Double nzd) {
        this.nzd = nzd;
    }

    @JsonProperty("PHP")
    public Double getPhp() {
        return php;
    }

    @JsonProperty("PHP")
    public void setPhp(Double php) {
        this.php = php;
    }

    @JsonProperty("SGD")
    public Double getSgd() {
        return sgd;
    }

    @JsonProperty("SGD")
    public void setSgd(Double sgd) {
        this.sgd = sgd;
    }

    @JsonProperty("THB")
    public Double getThb() {
        return thb;
    }

    @JsonProperty("THB")
    public void setThb(Double thb) {
        this.thb = thb;
    }

    @JsonProperty("ZAR")
    public Double getZar() {
        return zar;
    }

    @JsonProperty("ZAR")
    public void setZar(Double zar) {
        this.zar = zar;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
