package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.SortedMap;

public class ProductBasket {

    private final Product[] basket;
    public ProductBasket(){
        this.basket = new Product[6];
    }
    public boolean addProduct(Product product) {

        if (product == null) return false;
        for (int i = 0; i < basket.length; ++i){
            if (basket[i] == null){
                basket[i] = product;
                return true;
            }
        }
        return false;
    }
    public void getFullCost(){
        int fullCost = 0;
        for (int i = 0; i < basket.length; i++){
            if (basket[i] == null) continue;
            fullCost = fullCost + basket[i].getCost();
        }
        System.out.println("Итого: " + fullCost);
    }

    public void printBasket(){
        for (Product e : basket){
            if (basket.length == 0){
                System.out.println("в корзине пусто");
            }
            if (e == null) {System.out.println("null");}
            else {
            e.toString();}
        }
    }

    public void countSpecialProducts(){
        boolean empty = true;
        int count = 0;
        for (Product e : basket){
            if (e != null && e.isSpecial()){
                count++;
            }
            empty = false;
        }
        System.out.println("Специальных товаров: " + count);
    }

    public boolean checkProduct(String name){
        for (int i = 0; i < basket.length; i++){
            if (basket[i] == null) {
                System.out.println(false);
                return false;
            }
            if (basket[i].getName().equals(name)){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public void clearbasket(){
        for (int i = 0; i < basket.length; i++){
            if (basket[i] != null) {
                basket[i] = null;
            }
        }
    }
}

