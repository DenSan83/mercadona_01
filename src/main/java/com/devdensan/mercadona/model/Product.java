package com.devdensan.mercadona.model;

public class Product {
    private int productId;
    private String productName;
    private String description;
    private String image;
    private float price;
    private Category category;
    private Promotion promotion;

    public Product() {
    }

    public Product(String productName, String description, String image, float price, Category category, Promotion promotion) {
        this.productName = productName;
        this.description = description;
        this.image = image;
        this.price = price;
        this.category = category;
        this.promotion = promotion;
    }

    public Product(int productId, String productName, String description, String image, float price, Category category, Promotion promotion) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.image = image;
        this.price = price;
        this.category = category;
        this.promotion = promotion;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", promotion=" + promotion +
                '}';
    }
}
