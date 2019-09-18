package pl.samouczekprogramisty.junit5;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static pl.samouczekprogramisty.junit5.Weight.*;


class WeightTest implements WeightScaling{

    @Test
    void getValueOrWeightUnits() {
        Weight weight = new Weight(BigDecimal.TEN.setScale(4),WeightUnit.KILOGRAMS);
        assertAll(
                ()-> assertEquals(weight.getValue(),new BigDecimal(10).setScale(4)),
                ()-> assertEquals(weight.getWeightUnit(), WeightUnit.KILOGRAMS)
        );
    }


    @Test
    void shouldConvertZeroKilogramValue(){
        Weight weight = new Weight(BigDecimal.ZERO,WeightUnit.KILOGRAMS).convertTo(WeightUnit.POUNDS);
        assertEquals(BigDecimal.ZERO.setScale(4), weight.getValue());
    }

    @Test
    void shouldConvertZeroPoundsValue(){
        Weight weight = new Weight(BigDecimal.ZERO,WeightUnit.POUNDS).convertTo(WeightUnit.KILOGRAMS);
        assertEquals(BigDecimal.ZERO.setScale(4), weight.getValue());
    }

    @Test
    void shouldConvert1PoundToKilogram(){
        Weight weight = new Weight(BigDecimal.ONE,WeightUnit.POUNDS).convertTo(WeightUnit.KILOGRAMS);
        assertEquals(POUND_TO_KILOGRAM_RATIO, weight.getValue());
    }

    @Test
    void shouldConvert1KilogramToPound(){
        Weight weight = new Weight(BigDecimal.ONE,WeightUnit.KILOGRAMS).convertTo(WeightUnit.POUNDS);
        Weight weight1 = new Weight(BigDecimal.ONE.divide(POUND_TO_KILOGRAM_RATIO,SCALE,ROUNDING_MODE), WeightUnit.POUNDS);
        assertEquals(weight1.getValue(), weight.getValue());
    }

    @Test
    void shouldNotConvertTheSameCurrency(){
        Exception exception = assertThrows(IllegalStateException.class, ()-> new Weight(BigDecimal.ZERO,WeightUnit.POUNDS).convertTo(WeightUnit.POUNDS));
        assertEquals("Same currency can not be converted", exception.getMessage());
    }

}