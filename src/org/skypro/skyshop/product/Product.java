package org.skypro.skyshop.product;

import java.util.Objects;

public class Product {
    private String name;
    private int cost;


    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    /*@Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Product product = (Product) o;
        return cost == product.cost && Objects.equals(name, product.name);
    }*/
    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }
}