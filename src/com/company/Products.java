package com.company;

public class Products {
    private Product [] products;
    private int currentProductNumber;

    public Products(final  int productsNumber) {
        this.products = new Product [productsNumber];
        currentProductNumber=-1;
    }
    public void findAmountSellIvanov() {
        int amount = 0;
        for (final Product product: products) {
            if (product.getSellerFistName().equals("Ivanov")) {
                amount+=product.getAmount();
            }
        }
        System.out.println("AmountSellIvanov:"+amount+"\n");
        for (final Product product: products) {
            if (product.getSellerFistName().equals("Ivanov")) {
                amount+=product.getAmount();
                System.out.println(product);
            }
        }
        System.out.println("\n");
    }
    Product maxPrice;
    public Product findAmountSellIvanovMaxPrice() {
        double max = 0;
        for (final Product product: products) {
            if (product.getPrice()>max) {
                max=product.getPrice();
                maxPrice=product;
            }
        }
        return maxPrice;
    }
    public void addProduct(final Product product) {
        if (++currentProductNumber < products.length) {
            products[currentProductNumber] = product;
        }
    }
    public String toString() {
        String result = "Product: " + System.lineSeparator();
        for (final Product product : products) {
            result += product + System.lineSeparator();
        }
        return result;
    }
}
