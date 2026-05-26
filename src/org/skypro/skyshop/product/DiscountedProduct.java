package org.skypro.skyshop.product;

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
        System.out.println(getName() + " со скидкой:" + getCost() + "(" + discount + "%)");
        return getName() + " со скидкой:" + getCost() + "(" + discount + "%)";
    }


}
