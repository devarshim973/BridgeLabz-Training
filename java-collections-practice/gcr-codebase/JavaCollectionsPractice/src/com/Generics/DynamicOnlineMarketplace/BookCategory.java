package com.Generics.DynamicOnlineMarketplace;

class BookCategory implements ProductCategory {

    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements ProductCategory {

    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements ProductCategory {

    public String getCategoryName() {
        return "Gadgets";
    }
}
