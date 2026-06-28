package org.skypro.skyshop.product;

    /** Объявляем реализаццию класса DiscountedProduct */

public class DiscountedProduct extends Product{

    private int cost;
    private int discount;

    public DiscountedProduct(String name, int cost, int discount){
        super(name);
        this.cost = cost;
        this.discount = discount;
    }

    @Override
    public int getCost() {
        return (cost - (cost * discount/100));
    }

    @Override
    public boolean isSpecial(){
        return true;
    }

    @Override
    public String toString(){
        return getName() + " со скидкой:" + getCost() + "(" + discount + "%)";
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
