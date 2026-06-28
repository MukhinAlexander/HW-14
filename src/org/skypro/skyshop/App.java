package org.skypro.skyshop;

import org.skypro.skyshop.Interface.Searchable;
import org.skypro.skyshop.SearchEngine.SearchEngine;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        SimpleProduct product0 = new SimpleProduct("Огурец", 100);
        DiscountedProduct product1 = new DiscountedProduct("Картофель", 50, 10);
        FixPriceProduct product2 = new FixPriceProduct("Яйца");
        SimpleProduct product3 = new SimpleProduct("Зелёный лук", 50);
        DiscountedProduct product4 = new DiscountedProduct("Редис", 200, 30);
        FixPriceProduct product5 = new FixPriceProduct("Горох");


        ProductBasket basket = new ProductBasket();
        ProductBasket basket1 = new ProductBasket();

        /** Добавление продуктов в корзину */

        basket.addProduct(product0);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);
        System.out.println();

        /** Добавление продукта в заполненную корзину, в которой нет свободного места. */

        //basket.addProduct(product4);
        System.out.println();

        /** Печать содержимого корзины с несколькими товарами. */

        basket.printBasket();

        /** Получение стоимости корзины с несколькими товарами. */

        basket.getFullCost();
        System.out.println();

        /** Проверка на то, что объект "специальный" */

        basket.countSpecialProducts();
        System.out.println();

        /** Поиск товара, который есть в корзине. */

        basket.checkProduct("Огурец");
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


        /** Проверка работы интерфейса Searchable*/


        SearchEngine newSearch = new SearchEngine();
        newSearch.addSearchable(product0);
        newSearch.addSearchable(product2);
        newSearch.addSearchable(product3);
        newSearch.addSearchable(product4);

        newSearch.search("PRODUCT");
    }
}


