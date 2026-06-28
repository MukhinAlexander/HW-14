package org.skypro.skyshop.SearchEngine;

import org.skypro.skyshop.Interface.Searchable;
import org.skypro.skyshop.product.Product;

public class SearchEngine {

    private final Searchable[] searchArray;

    public SearchEngine(){
        this.searchArray = new Searchable[5];
    }

    public boolean search(String string) {
        int resultCount = 0;
        for (int i = 0; i < searchArray.length; i++) {
            Searchable searchable = searchArray[i];
            if (searchable.searchTerm().contains(string)) {
                if (resultCount < searchArray.length) {
                    searchArray[resultCount] = searchable;
                    resultCount++;
                } else {
                    break; // Прекращаем поиск, если достигли лимита результатов
                }
            }
        }
        return true;
    }

    public boolean addSearchable(Searchable newSearchable){
        if (newSearchable == null) System.out.println("null");;
        for (int i = 0; i < searchArray.length; ++i){
            if (searchArray[i] == null){
                searchArray[i] = newSearchable;
                return true;
            }
        }
        return false;
    }
}
