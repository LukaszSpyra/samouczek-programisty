package pl.samouczekprogramisty.exchange;

import java.math.BigDecimal;

public class PLN extends Currency {

    PLN(BigDecimal value) {
        if (BigDecimal.ZERO.compareTo(value) > 0){
            throw new IllegalArgumentException("Weight can't be negative");
        }
        this.value = value.setScale(SCALE,BigDecimal.ROUND_HALF_EVEN);
    }

    @Override
    protected Currency convertTo(CurrencySymbol currencySymbol) {
        if (currencySymbol == CurrencySymbol.PLN){
            throw new IllegalArgumentException ("Can not convert the same currency");
        }
        if (currencySymbol == CurrencySymbol.EUR){
            return new EUR(value.multiply(PLN_TO_EUR_RATIO.subtract(spreadEur)).setScale(SCALE,BigDecimal.ROUND_HALF_EVEN));
        }
        return new USD(value.multiply(PLN_TO_USD_RATIO.subtract(spreadUsd)).setScale(SCALE,BigDecimal.ROUND_HALF_EVEN));
    }
}
