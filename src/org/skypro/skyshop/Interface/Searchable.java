package org.skypro.skyshop.Interface;

public interface Searchable {

    public String searchTerm();

    public String getTypeContent();

    default void getStringRepresentation() {
        return;
    }
}
