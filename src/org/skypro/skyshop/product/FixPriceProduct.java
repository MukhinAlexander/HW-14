package org.skypro.skyshop.product;

    /** Объявляем реализаццию класса FixPriceProduct */

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
        return getName() + " c фиксированной ценой: " + "Фиксированная цена " + FIX_PRICE;
    }

    /** Оверрайдим методы интерфейса Searchable */

    @Override
    public String searchTerm(){
        return getName() + "\n" + getTypeContent();
    }

    @Override
    public String getTypeContent(){
        return "PRODUCT";
    }

}
