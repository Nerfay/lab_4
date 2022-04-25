package com.company;

import java.time.LocalDate;

public class Product {
    private String sellerFistName;
    private String nameProduct;
    private int amount;
    private double price;
    private LocalDate dateOfSell;

    public Product(final String seller, final String nameProduct, final int amount, final double price, final int YYYY, final int MM, final int DD) {
        this.setSellerFistName(seller);
        this.setNameProduct(nameProduct);
        this.setAmount(amount);
        this.setPrice(price);
        this.setDateOfSell(YYYY, MM, DD);
    }

    public String getSellerFistName() {
        return sellerFistName;
    }

    public void setSellerFistName(String sellerFistName) {
        this.sellerFistName = Utilities.correctingSellerFirstName(sellerFistName);
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = Utilities.correctingAmount(amount);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Utilities.correctingPrice(price);
    }

    public LocalDate getDateOfSell() {
        return dateOfSell;
    }

    public void setDateOfSell(int YYYY, int MM, int DD) {
        boolean isCorrectDateofSell = true;
        if ((YYYY > LocalDate.now().getYear()) || (MM > 12) || (DD > 31)) isCorrectDateofSell = false;
        if ((MM == 2) && (DD > 28)) isCorrectDateofSell = false;
        if (((MM == 4) || (MM == 6) || (MM == 9) || (MM == 11)) && (DD > 30)) isCorrectDateofSell = false;
        if (isCorrectDateofSell) {
            this.dateOfSell = LocalDate.of(YYYY, MM, DD);
        } else {
            this.dateOfSell = LocalDate.of(-1, -1, -1);
            System.out.println("Incorrect data!");
        }
    }

    public String toString() {
        return "Product[" +
                "SellerFirstName=" + sellerFistName +
                ", NameProduct=" + nameProduct +
                ", Amount=" + amount +
                ", Price=" + price +
                ", DateOfSell=" + dateOfSell +
                "]";
    }
}
