/** package pl.samouczekprogramisty.exchange;

import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyTest {

    @Test
    public void shouldConvert1EURtoPLN() {
        EUR eur = new EUR(BigDecimal.ONE);
        BigDecimal ratio = new BigDecimal("3.70");
        assertEquals(ratio,eur.convertTo(CurrencySymbol.PLN).getValue());
    }

    @Test
    public void shouldConvert0EURtoPLN() {
        EUR eur = new EUR(BigDecimal.ZERO);
        BigDecimal ratio = new BigDecimal("0.00");
        assertEquals(ratio,eur.convertTo(CurrencySymbol.PLN).getValue());
    }

    @Test
    public void shouldConvert1EURtoUSD() {
        EUR eur = new EUR(BigDecimal.ONE);
        BigDecimal ratio = new BigDecimal("1.11");
        assertEquals(ratio,eur.convertTo(CurrencySymbol.USD).getValue());
    }

    @Test
    public void shouldConvert0EURtoUSD() {
        EUR eur = new EUR(BigDecimal.ZERO);
        BigDecimal ratio = new BigDecimal("0.00");
        assertEquals(ratio,eur.convertTo(CurrencySymbol.USD).getValue());
    }


    @Test
    public void shouldConvert1USDtoPLN() {
        USD usd = new USD(BigDecimal.ONE);
        BigDecimal ratio = new BigDecimal("3.33");
        assertEquals(ratio,usd.convertTo(CurrencySymbol.PLN).getValue());
    }

    @Test
    public void shouldConvert0USDtoPLN() {
        USD usd = new USD(BigDecimal.ZERO);
        BigDecimal ratio = new BigDecimal("0.00");
        assertEquals(ratio,usd.convertTo(CurrencySymbol.PLN).getValue());
    }

    @Test
    public void shouldConvert1USDtoEUR() {
        USD usd = new USD(BigDecimal.ONE);
        BigDecimal ratio = new BigDecimal("0.87");
        assertEquals(ratio,usd.convertTo(CurrencySymbol.EUR).getValue());
    }

    @Test
    public void shouldConvert0USDtoEUR() {
        USD usd = new USD(BigDecimal.ZERO);
        BigDecimal ratio = new BigDecimal("0.00");
        assertEquals(ratio,usd.convertTo(CurrencySymbol.EUR).getValue());
    }

    @Test
    public void shouldConvert1PLNtoUSD() {
        PLN pln = new PLN(BigDecimal.ONE);
        BigDecimal ratio = new BigDecimal("0.24");
        assertEquals(ratio,pln.convertTo(CurrencySymbol.USD).getValue());
    }

    @Test
    public void shouldConvert0PLNtoUSD() {
        PLN pln = new PLN(BigDecimal.ZERO);
        BigDecimal ratio = new BigDecimal("0.00");
        assertEquals(ratio,pln.convertTo(CurrencySymbol.USD).getValue());
    }

    @Test
    public void shouldConvert1PLNtoEUR() {
        PLN pln = new PLN(BigDecimal.ONE);
        BigDecimal ratio = new BigDecimal("0.19");
        assertEquals(ratio,pln.convertTo(CurrencySymbol.EUR).getValue());
    }

    @Test
    public void shouldConvert0PLNtoEUR() {
        PLN pln = new PLN(BigDecimal.ZERO);
        BigDecimal ratio = new BigDecimal("0.00");
        assertEquals(ratio,pln.convertTo(CurrencySymbol.EUR).getValue());
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldNotConvert1EURtoEUR() {
        EUR eur = new EUR(BigDecimal.ONE);
        eur.convertTo(CurrencySymbol.EUR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotConvert1PLNtoPLN() {
        PLN pln = new PLN(BigDecimal.ONE);
        pln.convertTo(CurrencySymbol.PLN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotConvert1USDtoUSD() {
        USD usd = new USD(BigDecimal.ONE);
        usd.convertTo(CurrencySymbol.USD);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptNegativeUSD() {
        USD usd = new USD(BigDecimal.valueOf(-1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptNegativeEUR() {
        EUR eur = new EUR(BigDecimal.valueOf(-1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptNegativePLN() {
        PLN pln = new PLN(BigDecimal.valueOf(-1));
    }
} */