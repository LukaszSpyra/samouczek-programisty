package pl.samouczekprogramisty.exchange;

import java.math.BigDecimal;

public class EUR extends Currency {

    EUR(BigDecimal value) {
        if (BigDecimal.ZERO.compareTo(value) > 0){
            throw new IllegalArgumentException("Weight can't be negative");
        }
        this.value = value.setScale(SCALE,BigDecimal.ROUND_HALF_EVEN);
    }

    @Override
    protected Currency convertTo(CurrencySymbol currencySymbol) {
        if (currencySymbol == CurrencySymbol.EUR){
            throw new IllegalArgumentException ("Can not convert the same currency");
        }
        if (currencySymbol == CurrencySymbol.PLN){
            return new PLN(value.divide(PLN_TO_EUR_RATIO.add(spreadEur),SCALE,BigDecimal.ROUND_HALF_EVEN).setScale(SCALE,BigDecimal.ROUND_HALF_EVEN));
        }
        return new USD(value.multiply(EUR_TO_USD_RATIO.subtract(spreadUsd_Eur)).setScale(SCALE,BigDecimal.ROUND_HALF_EVEN));
        }

}

