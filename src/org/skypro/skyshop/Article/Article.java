package org.skypro.skyshop.Article;

import org.skypro.skyshop.Interface.Searchable;

    /** Объявляем реализаццию класса Article */

public class Article implements Searchable {

    private final String nameArticle;
    private final String textArcticle;

    public Article (String name, String text){

        this.nameArticle = name;
        this.textArcticle = text;
    }

    public String getNameArticle(){
        return nameArticle;
    }

    public String getTextArcticle(){
        return textArcticle;
    }

    @Override
    public String getStringRepresentation(){
        return getNameArticle() + " статьи" + "\n" + getTextArcticle() + " статьи";
    }

    /** Оверрайдим методы интерфейса Searchable */

    @Override
    public String searchTerm(){
        return toString();
    }

    @Override
    public String getTypeContent(){
        return "ARTICLE";
    }
}
