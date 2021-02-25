package com.example.premgeneralstore;

public class Product {

    private int imageResourceId = -1;
    private String productName;
    private String MRP;
    private String rate;
    private String discount = "";

    public Product(int imageResourceId, String productName, String MRP, String rate, String discount){

        this.imageResourceId = imageResourceId;
        this.productName = productName;
        this.MRP = MRP;
        this.rate = rate;
        this.discount = discount;
    }


    public Product(int imageResourceId, String productName, String MRP, String rate){

        this.imageResourceId = imageResourceId;
        this.productName = productName;
        this.MRP = MRP;
        this.rate = rate;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getProductName() {
        return productName;
    }

    public String getMRP() {
        return "MRP:₹" + MRP;
    }

    public String getRate() {
        return "Price: ₹" + rate;
    }

    public int getRateInt(){
        return Integer.parseInt(rate);
    }

    public String getDiscount() {

        if(!discount.equals(""))
            return discount + "% OFF";
        return "";
    }
}
