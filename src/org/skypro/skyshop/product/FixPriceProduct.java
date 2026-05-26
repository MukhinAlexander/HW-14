package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    private static final int FIX_PRICE = 30;

    public FixPriceProduct(String name){
        super(name);
    }

    @Override
    public int getCost(){
        return FIX_PRICE;

    }

    @Override
    public boolean isSpecial(){
        return true;
    }

    @Override
    public String toString(){
        System.out.println(getName() + " c фиксированной ценой: " + "Фиксированная цена " + FIX_PRICE);
        return getName() + " c фиксированной ценой: " + "Фиксированная цена " + FIX_PRICE;
    }


}
