package org.skypro.skyshop.product;

    /** Объявляем реализаццию класса SimpleProduct */

public class SimpleProduct extends Product{

    private int cost;

    public SimpleProduct(String name, int cost){
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public boolean isSpecial(){
        return false;
    }

    @Override
    public String toString(){
        return getName() + ": " + getCost();
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
