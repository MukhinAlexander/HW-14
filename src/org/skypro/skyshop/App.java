package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        Product product0 = new Product("Огурец", 100);
        Product product1 = new Product("Картофель", 50);
        Product product2 = new Product("Яйца", 120);
        Product product3 = new Product("Зелёный лук", 40);
        Product product4 = new Product("Редис", 30);
        Product product5 = new Product("Свёкла", 130);


        ProductBasket basket = new ProductBasket();
        ProductBasket basket1 = new ProductBasket();

        /** Добавление продуктов в корзину */

        basket.addProduct(product0);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        System.out.println();

        /** Добавление продукта в заполненную корзину, в которой нет свободного места. */

        basket.addProduct(product4);
        System.out.println();

        /** Печать содержимого корзины с несколькими товарами. */

        basket.printBasket();
        System.out.println();

        /** Получение стоимости корзины с несколькими товарами. */

        basket.getFullCost();
        System.out.println();

        /** Поиск товара, который есть в корзине. */

        basket.checkProduct("Зелёный лук");
        System.out.println();

        /** Поиск товара, которого нет в корзине. */

        basket.checkProduct("Свёкла");
        System.out.println();

        /** Очистка корзины.*/

        basket.clearbasket();
        basket.printBasket();
        System.out.println();

        /** Получение стоимости пустой корзины. */
        basket.getFullCost();
        System.out.println();

        /** Поиск товара по имени в пустой корзине. */

        basket.checkProduct("Огурец");
    }
}


