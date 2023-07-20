package co.develhope.introduction.MethodsOverriding;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{
    String priceType;
    double priceInEuros;

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException{
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();

        return clonedSmartphonePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    SmartphonePrice(String type,int price){
        this.priceInEuros = price;
        this.priceType = type;
    }
}

