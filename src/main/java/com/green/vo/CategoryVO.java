package com.green.vo;

public class CategoryVO {
    private int id;
    private String category_name;
    private int product_id;

    public int getId() {
        return id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
}
