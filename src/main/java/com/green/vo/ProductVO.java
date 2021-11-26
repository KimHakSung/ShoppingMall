package com.green.vo;


import java.util.Date;

public class ProductVO {
    private int id;
    private String product_name;
    private String product_price;
    private int product_discount;
    private int product_totalprice;
    private int  product_stock;
    private String product_img;
    private Date product_date;

    public int getId() {
        return id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public int getProduct_discount() {
        return product_discount;
    }

    public int getProduct_totalprice() {
        return product_totalprice;
    }

    public int getProduct_stock() {
        return product_stock;
    }

    public String getProduct_img() {
        return product_img;
    }

    public Date getProduct_date() {
        return product_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public void setProduct_discount(int product_discount) {
        this.product_discount = product_discount;
    }

    public void setProduct_totalprice(int product_totalprice) {
        this.product_totalprice = product_totalprice;
    }

    public void setProduct_stock(int product_stock) {
        this.product_stock = product_stock;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public void setProduct_date(Date product_date) {
        this.product_date = product_date;
    }
}
