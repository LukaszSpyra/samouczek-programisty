package pl.samouczekprogramisty.exchange;

import java.math.BigDecimal;

enum CurrencySymbol{
    USD,
    PLN,
    EUR
}

public abstract class Currency implements ExchangeRates {

    BigDecimal value;

    protected abstract Currency convertTo(CurrencySymbol currencySymbol);

    public BigDecimal getValue() {
        return value;
    }
}

