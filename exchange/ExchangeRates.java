package pl.samouczekprogramisty.exchange;

import java.math.BigDecimal;

public interface ExchangeRates {
    int SCALE = 2;

    BigDecimal PLN_TO_USD_RATIO = new BigDecimal("0.26541").setScale(SCALE,BigDecimal.ROUND_HALF_EVEN);
    BigDecimal PLN_TO_EUR_RATIO = new BigDecimal("0.23445").setScale(SCALE,BigDecimal.ROUND_HALF_EVEN);
    BigDecimal EUR_TO_USD_RATIO = new BigDecimal("1.13097").setScale(SCALE,BigDecimal.ROUND_HALF_EVEN);
    BigDecimal spreadUsd_Eur = new BigDecimal("0.02");
    BigDecimal spreadEur = new BigDecimal("0.04");
    BigDecimal spreadUsd = new BigDecimal("0.03");
}
