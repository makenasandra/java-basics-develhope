package co.develhope.introduction.MethodsOverriding;

import java.util.Objects;

public class Smartphone implements Cloneable {
    protected String brandName;
    protected String modelName;
    protected int batterymAh;
    protected SmartphonePrice producerPrice;
    protected SmartphonePrice retailPrice;

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException{
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = this.producerPrice;
        clonedSmartphone.retailPrice = this.retailPrice;

        return clonedSmartphone;
    }

     Smartphone(String brand,String model,int battery,SmartphonePrice prodP,SmartphonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
     }
}
