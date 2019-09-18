package pl.samouczekprogramisty.junit5;

import java.math.BigDecimal;

enum WeightUnit{
    POUNDS, KILOGRAMS;
    }

public class Weight implements WeightScaling {
    public static final BigDecimal POUND_TO_KILOGRAM_RATIO = new BigDecimal("0.453592").setScale(SCALE,ROUNDING_MODE);
    private BigDecimal value;
    private WeightUnit weightUnit;

    public BigDecimal getValue() {
        return value;
    }

    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    public Weight(BigDecimal value, WeightUnit weightUnit) {
        if (BigDecimal.ZERO.compareTo(value) > 0){
            throw new IllegalArgumentException("Weight can't be negative");
        } this.value = value.setScale(SCALE, ROUNDING_MODE);
        this.weightUnit = weightUnit;
    }

    public Weight convertTo(WeightUnit convertTo){
        if (convertTo == getWeightUnit()){
            throw new IllegalStateException("Same currency can not be converted");
        }
        if (convertTo == WeightUnit.KILOGRAMS){
            return new Weight(value.multiply(POUND_TO_KILOGRAM_RATIO).setScale(SCALE,ROUNDING_MODE),WeightUnit.KILOGRAMS);
        }
        else {
            return new Weight(value.divide(POUND_TO_KILOGRAM_RATIO,SCALE,ROUNDING_MODE).setScale(SCALE,ROUNDING_MODE),WeightUnit.POUNDS);
        }
    }
}
