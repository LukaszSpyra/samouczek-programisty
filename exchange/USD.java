package pl.samouczekprogramisty.exchange;

import java.math.BigDecimal;

public class USD extends Currency {

    USD(BigDecimal value) {
        if (BigDecimal.ZERO.compareTo(value) > 0){
            throw new IllegalArgumentException("Weight can't be negative");
        }
        this.value = value.setScale(SCALE,BigDecimal.ROUND_HALF_EVEN);
    }

    @Override
    protected Currency convertTo(CurrencySymbol currencySymbol) {
        if (currencySymbol == CurrencySymbol.USD){
            throw new IllegalArgumentException ("Can not convert the same currency");
        }
        if (currencySymbol == CurrencySymbol.EUR){
            return new EUR(value.divide(EUR_TO_USD_RATIO.add(spreadUsd_Eur),SCALE, BigDecimal.ROUND_HALF_EVEN).setScale(SCALE,BigDecimal.ROUND_HALF_EVEN));
        }
        return new PLN(value.divide(PLN_TO_USD_RATIO.add(spreadUsd),SCALE,BigDecimal.ROUND_HALF_EVEN).setScale(SCALE,BigDecimal.ROUND_HALF_EVEN));
    }
}