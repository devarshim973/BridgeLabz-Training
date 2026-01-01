package com.Day1;

import java.util.ArrayList;
import java.util.List;

class ShoppingCartContainer {

    private List<StoreBook> cartItems = new ArrayList<>();

    public void addBook(StoreBook book) {
        cartItems.add(book);
    }

    public List<StoreBook> getCartItems() {
        return cartItems;
    }
}
